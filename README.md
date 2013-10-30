ERMA Koans
==========

ERMA Koans intend to help your learn how to best use [ERMA](https://github.com/erma/erma) to get data out of your application efficiently.

Running Instructions:
---------------------
* Get the Koans. Either:
   * Download and unarchive the contents of the most recent java-koans in development from:
https://github.com/matyb/erma-koans/archive/master.zip
   * or, clone the repo with :
```git clone https://github.com/flatiron32/erma-koans.git```
* Open a terminal and cd to the directory you unarchived or cloned:
```cd <the directory you just unarchived or cloned>```
* Within it you'll find:
    * *koans*: this directory contains the application and its lessons, it is all that is needed to advance through the koans themselves and **it can be distributed independently**
* Change directory to the koans directory: ```cd koans```
* If you are using windows enter: ```run.bat``` or ```sh run.sh``` if you are using Mac or Linux.

Developing a Koan:
-----------------
* Follow any of the existing koans as an example to create a new class with koan methods (indicated by the @Koan annotation, they're public and specify no arguments)
* Define the order the koan suite (if it's new) will run in the koans/app/config/PathToEnlightenment.xml file
* Optionally you may use dynamic content in your lesson, examples are located in the XmlVariableInjector class (and Test) and the AboutKoans.java file

Something's wrong:
------------------
* If the koans app is constantly timing out compiling a koan, your computer may be too slow to compile the koan classes with the default timeout value. Update the compile_timeout_in_ms property in koans/app/config/config.properties with a larger value and try again.
* If you're running the koans command with the class and/or method arguments, the app may hang if the class you saved won't compile. Until this is fixed, when you you suspect this is occuring revert to a state the file compiled and try again.

Acknologments:
------------------
* This is built off the framework developed by [Mat Bentley](https://github.com/matyb) for [java-koans](https://github.com/matyb/java-koans). If you don't know Java, that is a good place to get started.
