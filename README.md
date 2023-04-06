# CSCI 1302 - Gallery v2023.sp

![Approved for: Spring 2023](https://img.shields.io/badge/Approved%20for-Spring%202023-magenta)

![Some Image](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-gallery.jpg)

This document contains the description for the `cs1302-gallery` project
assigned to the students in the Spring 2023 CSCI 1302 classes
at the University of Georgia.

## Deadline Options

There are different deadline options for this project. Students who perform their
final submission via the `submit` command before the date/times listed below
automatically receive the associated Submission-Based (SB) extra credit. The late
penalty does not start applying until after the final date listed.

* **FRI 2023-04-21 (Apr 21) @ 11:55 PM EST (`+10` SB Extra Credit)**
* **SAT 2023-04-22 (Apr 22) @ 11:55 PM EST (`+5` SB Extra Credit)**
* **SUN 2023-04-23 (Apr 23) @ 11:55 PM EST (`+0` SB Extra Credit)**

**Please read the entirety of this file before
beginning your project, including the FAQ in
the Appendix.**

## Table of Contents

* [Learning Outcomes](#course-specific-learning-outcomes)
* [Academic Honesty](#academic-honesty)
* [Updates](#updates)
* [Project Description](#project-description)
* [Suggested Checklist](#suggested-checklist)
* [Project Requirements & Grading](#project-requirements--grading)
  * [Functional Requirements](#functional-requirements)
  * [Non-Functional Requirements](#non-functional-requirements)
  * [Absolute Requirements](#absolute-requirements)
* [How to Download the Project](#how-to-download-the-project)
* [Submission Instructions](#submission-instructions)
* [Appendix - Useful Links](#appendix---useful-links)
* [Appendix - FAQ](#appendix---faq)

## Course-Specific Learning Outcomes

* **LO1.d:** Use shell commands to compile new and existing software solutions that
are organized into multi-level packages and have external dependencies.
* **LO2.e:** Utilize existing generic methods, interfaces, and classes in a software solution.
* **LO3.a:** Create and update source code that adheres to established style guidelines.
* **LO3.b:** Create class, interface, method, and inline documentation that satisfies a set of requirements.
* **LO5.b:** Utilize a build tool such as Maven or Ant to create and manage a complex software solution involving external dependencies.
* **LO7.a:** Design and implement a graphical user interface in a software project.
* **LO7.c:** Use common abstract data types and structures, including lists, queues, arrays, and stacks in solving typical problems.

## Academic Honesty

You agree to the Academic Honesty policy as outlined in the course syllabus.
In accordance with this notice, I must caution you **not** to
fork this repository on GitHub if you have an account. Doing so will more than
likely make your copy of the project publicly visible. Please follow the
instructions contained in the
[How to Download the Project](#how-to-download-the-project)
section below in order to do your development on odin. Furthermore, you must adhere 
to the copyright notice and licensing information at the bottom of this document.

## Updates

Updates will be posted here. You will be informed about any changes
through **Piazza** and **eLC** so please keep a lookout for them.

## Project Description

Your goal is to implement a GUI application in Java using JavaFX 17 that displays a
gallery of images based on the results of a search query to the
[iTunes Search API](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/#searching).
This will require you to lookup things in Javadoc and apply your knowledge of
things like inheritance, polymorphism, and interfaces. The functional
and non-functional requirements for this project are outlined later in this
document. Here is an example of what your program might look like:

[![screenshot1](https://raw.githubusercontent.com/cs1302uga/cs1302-gallery/master/resources/screenshot.png)](https://youtu.be/5SsO63m-Q5A)

Click the image above or [here](https://youtu.be/5SsO63m-Q5A) for a video demo of the app (no audio).

Part of software development is being given a goal but not necessarily being
given instruction on all of the details needed to accomplish that goal. For example,
even though working with things like images, threads, JSON, and the iTunes Search API
haven't been covered in class, you are going to need to lookup how to do these things
in order to complete this project. Starter code and a generously helpful [FAQ](#faq)
are provided. After actively reading through the main parts of this project description
and taking notes, please read through the [FAQ](#faq) to see if it answers any of your
questions.

This project is also designed to help you better understand the usefulness of good
class design. While you can technically write your entire JavaFX-based
GUI application entirely in the `start` method, this will make your code messy,
hard to read, possibly redundant, likely more prone to errors, and it wouldn't pass
a style audit. Before you write any code, you should plan out your application's
scene graph (i.e., the containment hierarchy), and design custom components as needed.
If you find that you are writing a lot of code related to a specific component
(e.g., setting styling, adding event handlers, etc.), then it's probably
a good idea to make a custom version of that component in order to reduce
clutter.

We are also using this project to further introduce you to
[Maven](https://maven.apache.org/what-is-maven.html).
As you are actively encouraged to create and document additional classes in order
to create customized, reusable components (e.g., for dealing with the image views),
it would be slightly tedious to compile and run your code frequently.
Instead, you can use Maven to more easily compile your code and handle dependencies
(e.g., for the Gson library mentioned in the FAQ). Please see the
"Project Structure" sub-section of the
[Absolute Requirements](#absolute-requirements) section for an overview of
what you can do with Maven. While this project is already provided to you
as a Maven project, you may still find is useful to read the
[CSCI 1302 Maven Tutorial](https://github.com/cs1302uga/cs1302-tutorials/blob/alsi/maven.md)
to gain a better understanding of what Maven is.

## Suggested Checklist

To help you with planning out this project, here are some suggested steps you can take that
your instructors believe will help you complete the project more easily. Some of the
items in this checklist may not make sense until you have read the entire project description,
including the appendices. These steps are suggesions and, therefore, do not constitute an
exhaustive list of steps that you may need to take to complete the project.

**Preparation:**

- [ ] Read through the entire project description, including the appendices,
      **and write down questions as you go.**
- [ ] Read it again! This time, you may be able to answer some of your own
      questions.

**Frontend:**

- [ ] On paper, decompose the visual elements of your application to identify
      some of the objects you may need.
- [ ] On paper, draw the scene graph for your app.
- [ ] Identify opportunities for the creation of custom components.
- [ ] Write some of the code to make your app look like what it needs to look like.
- [ ] Use Git to stage and commit your changes often; create and merge branches,
      as needed.

**Backend:**

- [ ] Create any custom component classes.
- [ ] On paper, hash out how you might store the list or lists of image URIs.
- [ ] Write a method to retreive the JSON response string for a query to the iTunes
      Search API based on a query string.
- [ ] Write a method that returns a list of URI strings based on a JSON response
      string retrieved from the iTunes Search API.
- [ ] Use Git to stage and commit your changes often; create and merge branches,
      as needed.

**Putting it all Together:**

- [ ] Consider using a list or array to help you access the various `ImageView`
      objects in your scene; making new `ImageView` objects all the time is
      _not_ reccommended. Remember, the `ImageView` objects are like the picture
      frames. You wouldn't toss out a picture frame every time you changed the picture.
- [ ] Make the buttons work at a basic level (you can decide what basic is).
- [ ] Make the progress bar work (requires careful consideration of the threading
      required by some of your app's event handlers).
- [ ] Make the random-replacement work.
- [ ] Use Git to stage and commit your changes often; create and merge branches,
      as needed.

## Project Requirements & Grading

This assignment is worth 100 points. The lowest possible grade is 0, and the
highest possible grade is 110 (due to extra credit).

### Functional Requirements

* **Main Requirements (100 points):** Your application needs to have the components
  listed below. They need to function as described. If a certain aspect of a component
  (e.g., style or behavior) is not specified in these requirements, then that
  aspect is at the discretion of the implementor. The screenshot provided earlier
  in this project description is meant to serve as a reference.
  **It is okay if implementors deviate visually from the screenshot.** You should
  setup the application's scene graph in whatever way makes most sense to you and meets
  the requirements. In addition to the required components, implementors should feel
  free to add more components and/or functionality as long they do not distract too heavily
  from the functionality of the required components. Here are the required components:

  Before we break down the points, please see the mockup below, which contain notes
  about the app's required functionality. **Details provided in the mockup are to be
  considered as part of the project requirements.** To access the mockup, you can click on the
  image below or the link below the image.

  <p align="center">
  <a href="https://www.figma.com/file/EGF7oPEpbLIdlQIrXsPRD7/cs1302-gallery?node-id=0%3A1"><img src="https://raw.githubusercontent.com/cs1302uga/cs1302-gallery/master/resources/mockup_thumb.png"></a>
  <br>
  <a href="https://www.figma.com/file/EGF7oPEpbLIdlQIrXsPRD7/cs1302-gallery?node-id=0%3A1">Entire Mockup</a> | <a href="https://www.figma.com/proto/EGF7oPEpbLIdlQIrXsPRD7/cs1302-gallery?page-id=0%3A1&node-id=1%3A3&viewport=241%2C48%2C1.08&scaling=min-zoom&starting-point-node-id=1%3A3&show-proto-sidebar=1">Mockup Slideshow</a>
  </p>

  Here are some details about the required elements:

  * **Search Bar (60 points):** The app  must have an area near the top that contains
    a play/pause button, a component for users to enter a search term, a component
    for users to select a media type, and a "Get Images" button. Additional
    details are provided in the mockup.

    * *Play/Pause Button (10 points):* This button should allow the user to
      enter and leave "play" mode, the semantics of which are described
      later under "Random Replacement." The button text should change, as needed,
      to reflect whether the app is "play" mode.

    * *Query Term Field (10 points):* This component should allow the user to
      enter in a **term** that your application will use when it queries the
	  iTunes Search API. Its initial contents should correspond to some default term
	  of your choosing (e.g., `"jack johnson"`).

    * *Query Media Type Dropdown (10 points):* This component should allow the user to
      select a **media** type that your application will use when it queries the
	  iTunes Search API. This dropdown should default to having "music" selected.

    * *Get Images Button (30 points):* This button should cause the application
      to query the iTunes Search API using the URL-encoded version of the term
      and media type provided by the user, then update the "Main Content" area
      accordingly and/or show an alert (if a problem is encountered).

	  * Instructions for how to query to iTunes Search API are provided
	    [here](#query-how), including a description of the parameters
		you can provide when performing a query. When your application performs
		a search query, **only the following parameters should be used:**

        | Parameter | Value                                                           |
        |-----------|-----------------------------------------------------------------|
        | `term`    | URL-encoded version of the **term** provided by the user.       |
        | `media`   | URL-encoded version of the **media** type provided by the user. |
        | `limit`   | `"200"`                                                         |

      * Only a distinct set of URIs should used if there
        are any duplicates. Implementers are not expected to handle situations
        where two distinct URIs refer to identical images.

      * If **less than twenty one (21)** distinct artwork image URIs are available
	    in the query response, then an alert dialog should be displayed to the
		user with an appropriate error message. In this scenario, the images in
		the main content area should not be updated.

      * If **twenty one (21) or more** distinct artwork image URIs are available in
	    the query response, then all the images associated with those distinct URIs
		should be downloaded. After all the downloads are complete, the main content
		area should be updated to display the first 20 downloaded images. The
        remaining images should not be omitted as they will be needed to facilitate
        the "random replacement" described elsewhere in this document.

  * **Message Bar (10):** The app must have an area near the top that
    provides initial instructions to a user, then gets updated over time,
    as the user interacts with the app. Additional details are provided in the
    mockup.

  * **Main Content (10):** The app must have an area near its center that displays
    a collection of twenty (20) artwork images. The initial set of images are all
    the same defult image (`"file:resources/default.png"`), but users can update
    the images by clicking the "Get Images" button. Additional details are provided in the
    mockup.

    * Images are gathered by querying the iTunes Search API. We have included
      information [here](#query-how) on how to programmatically perform such
      a query. A query response may contain multiple results, each with its own
      artwork URI (named `artworkUrl100`) that you can use to download the images.

  * **Status Bar (10)** The app must have an area near the botton that contains
    a functional progress bar and a message indicating that images are provided
    by the iTunes Search API. Additional details are provided in the mockup.

    * *Progress Bar (10 points):* The application needs to have a progress bar
      that indicates the progress of downloading all the images once a distinct
      set of image URIs is determined for a query response. Please note that
      **this progress bar is not merely aesthetic**. It should actually show the
      progress of downloading the individual images.

  * **Random Replacement (10):** The app must allow users to enter into a "play" mode
    after images are successfully gathered. While in play mode, the app reandomly
    replaces one of the displayed images with an already downloded image. Users
    should be able to turn off "play" mode once they start it, either by clicking
    "Pause" (changes to button to "Play" and stops the replacements) or by
    clicking the "Update Images" button. Whenever the play/pause button displays
    "Play" and is enabled, a user should be able to click the play/pause button
    to enter "play" mode. Additional details are provided in the mockup.

### Non-Functional Requirements

A non-functional requirement is *subtracted* from your point total if
not satisfied. In order to emphasize the importance of these requirements,
non-compliance results in the full point amount being subtracted from your
point total. That is, they are all or nothing.

* **(0 points) [RECOMMENDED] No Static Variables:** Use of static variables
  is not appropriate for this assignment. However, static constants
  and static utility and/or test methods are perfectly fine.

* **(10 points) User-Friendly Experience:**
  The windows of your application should not exceed a pixel dimension of 1280 (width) by 720 (height).
  Except for reasonable delays resulting X forwarding, your application should not
  hang/freeze or crash during execution. If a grader encounters lag, then they will
  try to run your application locally using the same version of Java/JavaFX that's used on Odin.

* **(20 points) Code Style Guidelines:** You should be consistent with the style
  aspect of your code in order to promote readability. Every `.java` file that
  you include as part of your submission for this project must be in valid style
  as defined in the [CS1302 Code Style Guide](https://github.com/cs1302uga/cs1302-styleguide).
  All of the individual code style guidelines listed in that document are part
  of this single non-functional requirement. Like the other non-functional
  requirements, this requirement is all or nothing.

  **NOTE:** The [CS1302 Code Style Guide](https://github.com/cs1302uga/cs1302-styleguide)
  includes instructions on how to use the `check1302` program to check
  your code for compliance on Odin.

* **In-line Documentation (10 points):** Code blocks should be adequately documented
  using in-line comments. This is especially necessary when a block of code
  is not immediately understood by a reader (e.g., yourself or the grader).

### Absolute Requirements

An absolute requirement is similar to a non-functional requirement, except that violating
it will result in an immediate zero for the assignment. In many cases, a violation
will prevent the graders from evaluating your functional requirements. No attempts will be
made to modify your submission to evaluate other requirements.

* **Project Structure:** The location of the default
  package for the source code should be a direct subdirectory called `src/main/java`.
  When the project is compiled using Maven, the the default package for compiled
  code should be `target/classes`. The classes in the starter code are in
  the `cs1302.gallery` package. **Any additional classes that you create should
  be located in or under the `cs1302.gallery` package.**
  The main application class should be `cs1302.gallery.GalleryApp`, and the
  driver class should be `cs1302.gallery.GalleryDriver`.

  Executable [scripts](https://github.com/cs1302uga/cs1302-tutorials/blob/alsi/scripts/scripts.md)
  are provided with the starter code to help you execute the various Maven commands
  with corrrect command-line arguments. Assuming you are in the top-level project directory,
  use the following commands to run Maven:

  * Clean and Compile:

    ```
    $ ./compile.sh
    ```

  * Clean, Compile, and Run:

    ```
    $ ./run.sh
    ```

  We encourage you to view the scripts, but you should not modify them. The graders will
  use the versions of these scripts provided with the starter code to compile and run
  your program.

* **Development Environment:** This project must *must compile and run*
  correctly on Odin using the specific version of Java that is enabled
  by the **CSCI 1302 shell profile**. For this requirement, the term
  *compile* should be interpreted as *compile with no errors or warnings*.

  If you decide to introduce additional `.java` files into your project,
  then they are expected to fulfill all non-functional and absolute requirements,
  even if the main parts of the project do not use them. This includes, but
  is not limited to the code style requirements. You may assume
  graders will compile your source code using Maven so that dependencies
  are handled automatically. You should remove any `.java` files that you
  do not need before submission.

* **No FXML or use of Scene Builder:** FXML and SceneBuilder
  are advanced tools that are not currently covered in this course. Use of
  either for this project is prohibited. Please note that the project is
  not easier with these tools. In most cases, they actually make the
  project harder, especially since those topics have not been covered.

* **No use of `JsonArray`, `JsonElement`, `JsonObject`, and `JsonParser`:**
  You may not use or mention the following classes provided by Gson:

  * `com.google.gson.JsonArray`
  * `com.google.gson.JsonElement`
  * `com.google.gson.JsonObject`
  * `com.google.gson.JsonParser`

  To parse a JSON-formatted string, use a `Gson` object's `fromJson` method to parse
  the string directly into instances of classes that represent the data. Classes for
  an iTunes Search response and result are provided with the starter code. Instructions
  for parsing JSON-formatted strings using `fromJson` is described in the
  [JSON reading](https://github.com/cs1302uga/cs1302-tutorials/blob/master/web/json.rst).

* **No use of the `openStream()` method in `URL`:**
  You may not use or mention the `openStream()` method provided by the `java.net.URL` class.
  If you need to access web content, then use an HTTP client as described in the
  [HTTP reading](https://github.com/cs1302uga/cs1302-tutorials/blob/master/web/http.rst).

### Grading

The graders will compile and run your code on Odin using Maven. They will test
each of the functional and non-functional requirements and total up the points
earned. This project is worth 100 points. Students have an opportunity to earn
up to an additional 10 points via extra credit.

## How to Download the Project

On Odin, execute the following terminal command in order to download the project
files into sub-directory within your present working directory:

```
$ git clone --depth 1 https://github.com/cs1302uga/cs1302-gallery.git
```

This should create a directory called <code>cs1302-gallery</code> in
your present working directory that contains the project files.

If any updates to the project files are announced by your instructor, you can
merge those changes into your copy by changing into your project's directory
on Odin and issuing the following terminal command:

```
$ git pull
```

If you have any problems with any of these procedures, then please contact
your instructor.

## Submission Instructions

You will be submitting your project via Odin before the deadline indicated
near the top of this document. Make sure your project files
are on <code>odin.cs.uga.edu</code>. Change into the parent directory of your
project directory. If you've followed the instructions provided in this document,
then the name of your project directory is likely <code>cs1302-gallery</code>.
While in your project's parent directory, execute the following command:

```
$ check1302 cs1302-gallery
```

If there are style guide violations, then fix them and retest your code! Once
you have no style guide violations, you can submit using the following command:

```
$ submit cs1302-gallery csci-1302
```

If you have any problems submitting your project then please send a private
post to your instructor via the course Piazza as soon as possible. However,
creating a post about something like this the day or night the project is due
is probably not the best idea.

# Appendix - Useful Links

## Important Readings

* [CSCI 1302 HTTP Reading](https://github.com/cs1302uga/cs1302-tutorials/blob/master/web/http.rst)
* [CSCI 1302 JSON Reading](https://github.com/cs1302uga/cs1302-tutorials/blob/master/web/json.rst)
* [CSCI 1302 JavaFX Bookmarks](https://github.com/cs1302uga/cs1302-tutorials/blob/master/javafx/javafx-bookmarks.md)

## Third Party APIs and Libraries

* [iTunes Search API](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/)
* [Google Gson Library](https://github.com/google/gson)


## Other

* [JavaScript Object Notation (JSON)](https://en.wikipedia.org/wiki/JSON)
* [URL Encoding](https://en.wikipedia.org/wiki/Percent-encoding)

# Appendix - FAQ

Below are some frequently asked questions related to this project.

1. <a id="query-how" />**How do I query the iTunes Search API?**

   In order query the iTunes Search API, you need to access the iTunes Search
   API service via a carefully contructed URI. Here is a an example of a query
   URI that searches for all
   [Jack Johnson](https://en.wikipedia.org/wiki/Jack_Johnson_(musician))
   audio and video content (movies,
   podcasts, music, music videos, audiobooks, short films, and tv shows):

   ```
   https://itunes.apple.com/search?term=jack+johnson&limit=200&media=music
   ```

   Here is a breakdown of the URI:

   | URL Component                     | Meaning                               |
   |-----------------------------------|---------------------------------------|
   | `https://itunes.apple.com/search` | Endpoint URI for the Search API       |
   | `?`                               | Denotes the start of the query string |
   | `term=jack+johnson`               | Parameter `key=value` pair            |
   | `&`                               | Denotes that an additional parameter is to follow |
   | `limit=200`                       | Parameter `key=value` pair            |
   | `&`                               | Denotes that an additional parameter is to follow |
   | `media=music`                     | Parameter `key=value` pair            |

   In this example, the parameters `term`, `limit`, and `media` are passed
   to the iTunes Search API along with their URL-encoded values (e.g., the user might
   enter the term `"jack johnson"` into the query text field, but the URL-encoded
   version `"jack+johnson"` is what is used in the URI string).

   If you want to read more about each parameter in the query URI, then refer to their
   entries in the
   [iTunes Search API documentation](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/).

   The body of the response, i.e., the content of a request to the iTunes Search API, is simply
   a string that is formatted using JavaScript Object Notation (JSON). You _could_
   perform string manipulation to retrieve pieces of information from this
   JSON-formatted string, however, in this project, you should parse it using a `Gson`
   object's `fromJson` method as described in the
   [JSON reading](https://github.com/cs1302uga/cs1302-tutorials/blob/master/web/json.rst).
   A complete example that illustrates how to download and parse the JSON-formatted
   string for a query to the iTunes Search API is also provided in the
   [HTTP reading](https://github.com/cs1302uga/cs1302-tutorials/blob/master/web/http.rst)
   (see `cs1302.web/cs1302.web.Example3` under "Complete Examples").

   **See the String:** You can see the giant JSON-formatted string by visiting
   one of your carefully constructed URLs for an iTunes Search API query.
   Some web browsers may display the string directly, while others may attempt to
   download it. You can see it on Odin using `wget` and `cat`
   (or use `less` if you want scrolling):

   ```
   $ wget -qO- "https://itunes.apple.com/search?term=jack+johnson&limit=200&media=music" | cat
   ```

   If you want to see formatted JSON output (i.e., properly tabbled, newlines added, etc.),
   then you might pipe the output of `wget` into `jq` instead:

   ```
   $ wget -qO- "https://itunes.apple.com/search?term=jack+johnson&limit=200&media=music" | jq "."
   ```

   **URL-Encoding:** You may have noticed that we said `jack+johnson` is the URL-encoded
   value for `"jack johnson"`. When constructing a URI query string (i.e., anything after the `?` in a URL or URI) in Java,
   take special care that any values (e.g., the value of the `term` parameter) are
   [URL-encoded](https://en.wikipedia.org/wiki/Percent-encoding).

   URL-encoding is easily accomplished for you using the static `encode` method in
   [`URLEncoder`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/net/URLEncoder.html).
   You should use the non-deprecated overload of this method, supplying `StandardCharsets.UTF_8`
   for the character encoding as seen in the
   [HTTP reading](https://github.com/cs1302uga/cs1302-tutorials/blob/master/web/http.rst).
   Here is an example that URL-encodes `"jack johnson"` into something that can be used
   in a URI query string:

   ```java
   URLEncoder.encode("jack johnson", StandardCharsets.UTF_8); // returns "jack+johnson"
   ```

   **IMPORTANT:** To be clear, you do **NOT** need to URL-encode the entire URI string; you only
   need to URL-encode the parameter values.

1. **How do I download and parse the JSON-formatted response body for a query?**

    Instructions that describe how to download content from a URI into a string
    are provided in the
    [HTTP reading](https://github.com/cs1302uga/cs1302-tutorials/blob/master/web/http.rst).
    That reading includes a complete example that illustrates how to download and parse the JSON-formatted
    string for a query to the iTunes Search API (see `cs1302.web/cs1302.web.Example3` under "Complete Examples").
    Classes to model the search response and results are already provided with
    this project's starter code:

    * [`cs1302.gallery.ItunesResponse`](src/main/java/cs1302/gallery/ItunesResponse.java)
    * [`cs1302.gallery.ItunesResult`](src/main/java/cs1302/gallery/ItunesResult.java)

    If you call `GSON.fromJson` inside your `GalleryApp.java` file, then use `ItunesResponse.class`
    for the second argument.

1. **How can I use Google Gson in my project?**

   We have already added the Gson library to your project by adding its Maven dependency
   to your `pom.xml` file. At the time of this writing, version `2.9.0` is the version
   we are using and is considered a stable release.

   The HTML Javadoc documentation for the Google Gson API can be found
   [here](https://www.javadoc.io/doc/com.google.code.gson/gson).

1. **What does "local variables referenced from a lambda expression must**
   **be final or effectively final" and how do I fix it?**

   Like local and anonymous classes, a lambda expression can only access local
   variables of the enclosing block that are `final` or effectively `final`.
   That is, a variable local to method can only be involved in the body of
   a lambda expression if it is either explicitly declared as `final` or if
   its value does not change after initialization over the entire body of
   the method. A variable is local to a method (i.e., it's a local variable)
   if it's declared inside of the method or if it's a parameter to the method.
   Please note that this restriction applies to the variables themselves and
   presents an interesting scenario in the case of local reference variables.
   A local reference variable may remain effectively `final` even if the
   internal state of the object being referenced is changed so long as the
   variable itself (i.e., the reference value) does not change.

   This problem can be usually be fixed by effectively making use of
   instance variables and/or writing methods that return an instance
   of the interface being implemented via the lambda. For example,
   consider the following scenario that results in the compile-time
   error message "local variables referenced from a lambda expression must
   be final or effectively final":

   ```java
   void someMethod() {
       for (int i = 0; i < 10; ++i) {
           EventHandler<ActionEvent> handler = e -> {
               // something involving i
               System.out.println(i);
           };
       } // for
   } // someMethod
   ```

   The variable `i` is local to `someMethod` and neither `final` nor
   effectively `final` because its value changes after each iteration
   of the for-loop. In this scenario, an instance variable is unlikely
   to be appropriate as the value of `i` itself does not need to be
   accessible to the rest of the methods in the class. A suggested way
   to fix this is to create a method that returns an object of the
   interface being implemented by the lambda expression, ensuring that
   `i` is effectively final in that method. Then, we can call that
   method in `someMethod` instead of creating the lambda there directly.
   For example:

   ```java
   EventHandler<ActionEvent> createHandler(int i) {
       EventHandler<ActionEvent> handler = e -> {
           // something involving i
           System.out.println(i);
       };
       return handler;
   } // createHandler
   ```

   ```java
   void someMethod() {
       for (int i = 0; i < 10; ++i) {
           EventHandler<ActionEvent> handler = createHandler(i);
       } // for
   } // someMethod
   ```

   In this new scenario, the variable `i` is an effectively final local variable
   in the block enclosing the lambda expression in `createHandler`, thus avoiding the
   problem described by the compiler.

   **Why is this an issue?** Well, the big reason is that the language does not support it.
   Why doesn't the language support it? I speculate that the reason has to do with
   how local variables are managed internally in memory. As methods get called and
   return they occupy and free up a region of memory called the program stack. It is
   very likely that the region of memory used by the method that created the lambda
   is freed up before the object created by the lambda is used. If the body of the
   lambda expression attempts to change the value of the variable, then what does
   that mean if the variable is not longer there!?

1. **How do I make my application not freeze/hang when executing long running event handlers?**

   For the most part, your GUI application is just like any other
   Java application you have ever written. If a line of code takes a long time to
   execute, then there is a delay before the next line of code is executed.
   This can be problematic in GUI applications since the underlying GUI
   framework, essentially, pauses what it is doing in order to do what you
   ask it to do. This can cause your GUI to hang/freeze (i.e., become unresponsive)
   when you have code blocks that take more than a few milliseconds.

   The way to solve this problem is through a basic use of threads.
   The term *thread* refers to a single thread of execution, in which
   code is executed in sequential order. When you start a Java program,
   you usually start with one thread that starts executing the `main`
   method. This thread is usually called the "main" thread. When you launch
   your JavaFX application using the `Application.launch` method, part of
   the application life-cycle is the creation of a thread for your GUI
   called the "JavaFX Application Thread". By default, any code
   executed by or in response to your GUI components (e.g., the code for an
   event handler) takes place in the JavaFX Application Thread. If you
   do not want your program to hang, then you will need to create a
   separate thread for your problematic code snippets. This works because
   a Java program can have multiple threads executing concurrently.

   Although we have been using "problematic code" to describe the code
   snippet causing the problem, such a code snippet really represents some
   "task" that you want your application to perform without hanging.
   Therefore, I will try to use "task" throughout the remainder of this
   response.

   To create a new thread, you need to instatiate a
   [`Thread`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Thread.html) object
   with a [`Runnable`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Runnable.html)
   implementation for your task. Since `Runnable` is a functional interface,
   this process is simplified using a lambda expression or method reference.
   Here is an example idiom of how to create and start a new thread for a task:
   ```java
   Runnable task = () -> {
       /* task code here */
   };
   Thread taskThread = new Thread(task);
   taskThread.setDaemon(true);
   taskThread.start();
   ```
   The call to `taskThread.setDaemon(true)` prevents this newly created thread from
   delaying program termination in the case where either the main thread
   or the JavaFX Application Thread terminate first. After the call to
   `taskThread.start()`, both the JavaFX Application Thread and the newly created
   thread are executing concurrently. You cannot assume that statements in
   either thread execute in any predetermined order.

   **Note:** Using a daemon thread may not be desirable when writing data to a
   file or database as the JVM may terminate the thread before it's finished.

   **From the Reading:** <a id="runNow"/> You are free to use the `runNow` method from the
   [Brief Introduction to Java Threads](https://github.com/cs1302uga/cs1302-tutorials/blob/master/threads/brief-intro-threads.md)
   reading (please attribute the reading in your Javadoc comment). This method
   wraps the lines above into a single method so that you can write the
   following instead:
   ```java
   runNow(() -> {
       /* task
        * code
        * here
        */
    });
    ```
    Or, if you have written a method for your task, then it looks even nicer:
    ```java
    runNow(() -> myTaskMethod());
    ```

1. <a id="not-on-fx-application-thread" />**What does "Not on FX application thread" mean and how do I fix it?**

   Usually an `IllegalStateException` with the message "Not on FX application thread"
   means that you are trying to access or modify some node (i.e., a component
   or container) in the scene graph from a code snippet that is not executing
   in the JavaFX Application Thread (see Q7 in this FAQ). If you want to fix this, then
   the code snippet that interacts with the scene graph needs to be wrapped
   in a [`Runnable`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Runnable.html)
   implementation and passed to the static `runLater` method in
   [`Platform`](https://openjfx.io/javadoc/17/javafx.graphics/javafx/application/Platform.html).
   Since `Runnable` is a functional interface, this process is simplified using
   a lambda expression or method reference. Here is a basic example:
   ```java
   Runnable sceneTask = () -> {
       /* place code interacting with scene graph here */
   };
   Platform.runLater(sceneTask);
   ```
   The `runLater` method ensures that the code in your `Runnable` implementation
   executes in the JavaFX Application Thread.

   While it might be tempting to place all of your task code in the
   `Runnable` implementation provided to `runLater`, that is not a good idea
   because it will be executed on the JavaFX Application Thread. If you
   already writing code for another thread, it was likely to avoid having it
   run on the JavaFX Application Thread. Multiple calls to the `runLater`
   method can be used, as needed, to ensure only the code that interacts with
   the scene graph is executed in the JavaFX Application Thread.

   <a name="progress-tip">**PROTIP:**</a> If the lambda expression that you pass into `Platform.runLater` uses a local
   variable, then we **strongly suggest** you refactor the call into its own method
   in order to guarantee that the local variable is final or effectively final when
   used in the lambda expression. Here is an example snippet that might be problematic:

   ```java
   Platform.runLater(() -> progressBar.setProgress(0));
   for (int i = 0; i < n; i++) {
       // some task
       // code here
       Platform.runLater(() -> progressBar.setProgress(1.0 * i / n)); // OH NO!
   } // for
   Platform.runLater(() -> progressBar.setProgress(1));
   ```

   An earlier FAQ question dealt with why the code above is an issue for the compiler.
   While the suggested solution there will also work here, this simplified approach
   may be more approachable for students. Simply create a method that performs
   the desired `Platform.runLater`:

   ```java
   private void setProgress(final double progress) {
       Platform.runLater(() -> progressBar.setProgress(progress));
   } // setProgress
   ```

   With that method present, we can simplify the original snippet:

   ```java
   setProgress(0);
   for (int i = 0; i < n; i++) {
       // some task
       // code here
       setProgress(1.0 * i / n); // NICE!
   } // for
   setProgress(1);
   ```

1. **How do I make a code snippet execute repeatedly with a delay between executions?**

   <a name="timeline">For</a> this particular task, creating a thread and attempting to make it
   wait is not the way to go. Instead, the easiest way to accomplish this in a JavaFX application is using the
   [`Timeline`](https://openjfx.io/javadoc/17/javafx.graphics/javafx/animation/Timeline.html)
   and [`KeyFrame`](https://openjfx.io/javadoc/17/javafx.graphics/javafx/animation/KeyFrame.html)
   classes. Here is an example that prints the current time (using
   [`LocalTime`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/LocalTime.html)) to
   standard output every two (2) seconds (specified using
   [`Duration`](https://openjfx.io/javadoc/17/javafx.base/javafx/util/Duration.html), indefinitely:
   ```java
   EventHandler<ActionEvent> handler = event -> System.out.println(LocalTime.now());
   KeyFrame keyFrame = new KeyFrame(Duration.seconds(2), handler);
   Timeline timeline = new Timeline();
   timeline.setCycleCount(Timeline.INDEFINITE);
   timeline.getKeyFrames().add(keyFrame);
   timeline.play();
   ```
   The `Timeline` object also hase a `pause` method to pause the execution of the timeline.
   Remember, JavaFX event handlers are executed on the JavaFX Application Thread.

1. <a id="obj-pass"/>**How do I pass around objects effectively?**

   From time to time, you may need to access one part of your app from another part of your app.
   You used a good design (e.g., classes and inheritance), but you find that you're passing a lot
   of reference variables around, perhaps through constructors. 
   
   The recommended strategy is to NOT pass objects via constructors. Instead, expose parts of 
   your custom components via getter methods in the custom component classes, then make the connections
   that you need in your `Application` subclass. The thinking here is that a component should be reusable,
   not just in the current app, but perhaps in future apps that you create. Just like the `Button` class
   exposes methods, so should your custom component class -- an app knows about a button, but the button's
   class need not know about the app. Methods in custom component classes should deal only with the nodes
   in that component. If you're trying to make part of a custom compnent deal with something outside of 
   the custom component, then the best place to make that connection is outside
   the custom component.

1. **How do I access a local, non-downloaded resource (e.g., an image file)?**

   You should place local files under `resources` in your project directory (you may need to
   create the `resources` directory). URIs or URLs prefixed with `file:` should be relative to your
   project directory.

   Example:

   | Resource                | URI/URL                        |
   |-------------------------|--------------------------------|
   | `resources/icon.png`    | `"file:resources/icon.png"`    |
   | `resources/foo/img.png` | `"file:resources/foo/img.png"` |

Have a question? Please post it on the course Piazza.

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
