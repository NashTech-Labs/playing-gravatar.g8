A [Giter8][g8] template to generate gravatar using email address with Play Framework!

About
-----
# [Playing Gravatar Image](https://github.com/knoldus/playing-gravatar)

[Gravatar](https://en.gravatar.com/support/what-is-gravatar/): An "avatar" is an image that represents you online—a little picture that appears next to your name when you interact with websites.

A Gravatar is a Globally Recognized Avatar. You upload it and create your profile just once, and then when you participate in any Gravatar-enabled site, your Gravatar image will automatically follow you there.

Gravatar images may be requested just like a normal image, using an IMG tag. To get an image specific to a user, you must first calculate their email hash.

The most basic image request URL looks like this:

http://www.gravatar.com/avatar/HASH

where HASH is replaced with the calculated hash for the specific email address you are requesting. For example:

http://www.gravatar.com/avatar/205e460b479e2e5b48aec07710c08d50

*Size* : By default, images are presented at 80px by 80px if no size parameter is supplied. You may request a specific image size, which will be dynamically delivered from Gravatar by using the s= or size= parameter and passing a single pixel dimension (since the images are square):

http://www.gravatar.com/avatar/205e460b479e2e5b48aec07710c08d50?s=200

*Default Image* : What happens when an email address has no matching Gravatar image? By default, this:

http://www.gravatar.com/avatar/00000000000000000000000000000000

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


Template license
----------------
Written in ​ 2017​ by ​ [Knoldus Software LLP](http://knoldus.com)

To the extent possible under law, the author(s) have dedicated all copyright and
related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See
<http://creativecommons.org/publicdomain/zero/1.0/>.
[g8]: http://www.foundweekends.org/giter8/
