
# CSCI 1302 - Gallery

This document contains the description for the Lists project
assigned to the students in the Fall 2017 CSCI 1302 classes
at the University of Georgia.

**Please read the entirety of this file before
beginning your project.** 

## Due Dates

This project is **DUE SUN 2017-11-12 @ 11:55 PM EDT**.

## Academic Honesty

You agree to the Academic Honesty policy as outlined in the course syllabus and
course website. In accordance with this notice, I must caution you to **not** 
fork this repository on GitHub if you have an account. Doing so will more than
likely make your copy of the project publicly visible. Please follow the 
instructions contained in the Resources section below in order to do your 
development on nike.

## Updates

Updates will be posted here. You will be informed about any changes 
through **Piazza** and **eLC** so please keep a lookout for them.

## Project Description

Your goal is to implement a GUI application in Java using JavaFX 8 that displays a 
gallery of images based on the results of a search query to the 
[iTunes Search API](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/#searching).
This will require you to lookup things in Javadoc and apply your knowledge of
things like inheritance, polymorphism, and lambda expressions. The functional
and non-functional requirements for this project are outlined later in this 
document. Here is an example of what your program might look like:

![screenshot1](https://i.imgur.com/mi2Gv7x.png)

Part of software development is being given a goal but not necessarily being 
given instruction on all of the details needed to accomplish that goal. For example,
even though working with things like images, threads, JSON, and the iTunes Search API 
haven't been covered in class, you are going to need to lookup how to do these things 
in order to complete this project. Starter code and a generously helpful [FAQ](#faq) 
are provided.

This project is also designed to help you better understand the usefulness of good
class design. While you can technically write your entire JavaFX-based
GUI application entirely in the `start` method, this will make your code messy, 
hard to read, possibly redundant, and likely more prone to errors.
Before you write any code, you should plan out your application's scene graph
(i.e., the containment hierarchy), and design custom components as needed.
If you find that you are writing a lot of code related to a specific component
(e.g., setting styling, adding event handlers, etc.), then it's probably 
a good idea to make a custom version of that component in order to reduce
clutter. 

### Learning Outcomes

* Implement generic classes according to an interface (1302-LO1).
* Utilitze inheritance and polymorphism in a software project (1302-LO3-LO4).
* TODO
* TODO

### Functional Requirements

* 

### Non-Functional Requirements

*  

* **Javadoc Documentation:** Each method and class needs to be documented
  using Javadoc comments. If a method overrides an inheritted method that is
  already documented, then that method only needs a Javadoc comment if the
  implementation differs from the existing documentation. 

* **In-line Documentation:** Code blocks should be adequately documented
  using in-line comments. This is especially necessary when a block of code
  is not immediately understood by a reader (e.g., the grader). 

### Grading

TODO

## Getting/Updating Skeleton Code

On Nike, execute the following terminal command in order to download the project
files into sub-directory within your present working directory:

```
$ git clone https://github.com/cs1302uga/cs1302-gallery.git
```

This should create a directory called <code>cs1302-gallery</code> in
your present working directory that contains the project files.

If any updates to the project files are announced by your instructor, you can
merge those changes into your copy by changing into your project's directory
on Nike and issuing the following terminal command:

```
$ git pull
```

If you have any problems with any of these procedures, then please contact
your instructor.

## Submission Instructions

You will be submitting your project via Nike before the deadline indicated
near the top of this document. Make sure your project files
are on <code>nike.cs.uga.edu</code>. Change into the parent directory of your
project directory. If you've followed the instructions provided in this document, 
then the name of your project directory is likely <code>cs1302-gallery</code>. 
While in your project's parent directory, execute the following command: 

```
$ submit cs1302-gallery cs1302a
```

It is also a good idea to email a copy to yourself. To do this, simply execute 
the following command, replacing the email address with your email address:

```
$ tar zcvf cs1302-gallery.tar.gz cs1302-gallery
$ mutt -s "[cs1302] cs1302-gallery" -a cs1302-gallery.tar.gz -- your@email.com < /dev/null
```

If you have any problems submitting your project then please send a private
post to your instructor via the course Piazza as soon as possible. However, 
creating a post about something like this the day or night the project is due 
is probably not the best idea.

# Supplement

## FAQ

Below are some frequently asked questions related to this project.

1. **How do I query the iTunes Search API?**
   
   In order query the iTunes Search API, you need to access the iTunes Search 
   API service via a carefully contructed URL. Here is a an example of a query
   URL that searches for all Jack Johnson audio and video content (movies, 
   podcasts, music, music videos, audiobooks, short films, and tv shows):
   ```
   https://itunes.apple.com/search?term=jack+johnson
   ```
   While something similar the above URL is all you need for this project,
   the iTunes Search API has many options to help fine tune your query.
   Please see the 
   [iTunes Search API documentation](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/)
   for more information.

   Query results are returned in JavaScript Object Notation (JSON) and will
   likely need to be parsed using a third party library in order to be used
   in your application. 

2. **How do I download the JSON result for a query?**

   TODO answer


3. **How do I parse the JSON result for a query?**

   TODO answer

Have a question? Please post it on the course Piazza.
