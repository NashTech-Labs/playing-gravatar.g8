package controllers

import play.api._
import play.api.mvc._
import utils.GravatarUtility
import play.api.data._
import play.api.data.Forms._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Gravatar Image", None, Nil))
  }

  val emailForm = Form(single("email" -> email))

  def gravatar = Action { implicit request =>
    val sizeList = List(20, 40, 80, 160, 200)
    emailForm.bindFromRequest.fold(
      formWithErrors => {
        // binding failure, you retrieve the form containing errors:
        BadRequest(views.html.index("Gravatar Image", None, Nil))
      },
      email => {
        /* binding success, you get the actual value. */
        val fGravUrls = sizeList.map { size => GravatarUtility.gravatarUrl(email, size) }
        val sGravUrls = sizeList.reverse.tail.map { size => GravatarUtility.gravatarUrl(email, size) }
        Ok(views.html.index("Gravatar Image", Some(email), fGravUrls ++ sGravUrls))
      })
  }

}