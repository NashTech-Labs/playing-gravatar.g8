# [Playing Gravatar Image](https://github.com/knoldus/playing-gravatar)
A basic example to generate gravatar using email address with Play Framework

-----------------------------------------------------------------------
### [Gravatar](https://en.gravatar.com/support/what-is-gravatar/)
-----------------------------------------------------------------------
An "avatar" is an image that represents you online—a little picture that appears next to your name when you interact with websites.

A Gravatar is a Globally Recognized Avatar. You upload it and create your profile just once, and then when you participate in any Gravatar-enabled site, your Gravatar image will automatically follow you there.

![alt tag](/public/images/gravatar.png)

- Used [Java Image Requests](https://en.gravatar.com/site/implement/images/) technique to generate hex format md5 of an input string
- Used [Gravatar Image Requests](https://en.gravatar.com/site/implement/images/) technique to access gravatar image
- Embedded JS & CSS libraries with [WebJars](http://www.webjars.org/)
- Integrating with a CSS framework (Twitter Bootstrap 3.1.1)
- Bootswatch-Darkly with Twitter Bootstrap 3.1.1 to improve the look and feel of the application

-----------------------------------------------------------------------
### Instructions
-----------------------------------------------------------------------
* To run the Play Framework, you need JDK 6 or later
* Install Typesafe Activator if you do not have it already. You can get it from [here](http://www.playframework.com/download) 
* Execute `./activator clean compile` to build the product
* Execute `./activator run` to execute the product
* playing-gravatar should now be accessible at localhost:9000

-----------------------------------------------------------------------
### References
-----------------------------------------------------------------------
* [Play Framework](http://www.playframework.com/)
* [Gravatar APIs](https://en.gravatar.com/site/implement/)
* [Bootstrap 3.1.1](http://getbootstrap.com/css/)
* [Bootswatch](http://bootswatch.com/darkly/)
* [WebJars](http://www.webjars.org/)

