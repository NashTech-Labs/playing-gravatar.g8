# [Playing Gravatar Image](https://github.com/knoldus/playing-gravatar)
A basic example to generate gravatar using email address with Play Framework

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

If you'd prefer to use your own default image (perhaps your logo, a funny face, whatever), then you can easily do so by supplying the URL to an image in the d= or default= parameter. The URL should be URL-encoded to ensure that it carries across correctly, for example:

http://www.gravatar.com/avatar/00000000000000000000000000000000?d=http%3A%2F%2Fexample.com%2Fimages%2Favatar.jpg

In addition to allowing you to use your own image, Gravatar has a number of built in options which you can also use as defaults. Most of these work by taking the requested email hash and using it to generate a themed image that is unique to that email address. To use these options, just pass one of the following keywords as the d= parameter to an image request:

- 404: do not load any image if none is associated with the email hash, instead return an HTTP 404 (File Not Found) response
- mm: (mystery-man) a simple, cartoon-style silhouetted outline of a person (does not vary by email hash)
- identicon: a geometric pattern based on an email hash
- monsterid: a generated 'monster' with different colors, faces, etc
- wavatar: generated faces with differing features and backgrounds
- retro: awesome generated, 8-bit arcade-style pixelated faces
- blank: a transparent PNG image (border added to HTML below for demonstration purposes)


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

