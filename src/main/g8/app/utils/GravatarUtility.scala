package utils

import java.security.MessageDigest
import play.api.Logger

object GravatarUtility {

  private val log: Logger = Logger(this.getClass)
  
  private val GRAV_IMG_BASE_URL: String = "http://www.gravatar.com/avatar/"

  /**
   * To generate gravatar Url
   *
   * @param email
   * @param size
   * @param default
   */
  def gravatarUrl(email: String, size: Int = 80, default: String = "mm"): String = {

    val gravReq: StringBuffer = new StringBuffer()

    val md5Email: String = md5Hex(email)
    gravReq.append(GRAV_IMG_BASE_URL)
    gravReq.append(md5Email + "?")

    if (size > 0 && size < 513) gravReq.append(s"s=${size}&")

    if (default.matches("mm|identicon|monsterid|wavatar|retro")) gravReq.append(s"d=$default")

    gravReq.toString
  }

  /**
   * To generate hex string
   *
   * @param array
   * @return
   */
  private def hex(array: Array[Byte]): String = {
    val sb: StringBuffer = new StringBuffer()
    for (byteChar <- array) {
      sb.append(Integer.toHexString((byteChar & 0xFF) | 0x100).substring(1, 3))
    }

    sb.toString
  }

  /**
   * To generate MessageDigest
   *
   * @param message
   * @return
   */
  private def md5Hex(message: String): String = {
    try {
      val md: MessageDigest = MessageDigest.getInstance("MD5")
      hex(md.digest(message.getBytes("CP1252")))
    } catch {
      case t: Throwable => ""
    }
  }

}
