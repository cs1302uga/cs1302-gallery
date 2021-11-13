# CSCI 1302 - Gallery v2021.fa

![Approved for: Fall 2021](https://img.shields.io/badge/Approved%20for-Fall%202021-blue)

![Some Image](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-gallery.jpg)

This document contains the description for the `cs1302-gallery` project
assigned to the students in the Fall 2021 CSCI 1302 classes
at the University of Georgia.

## Deadline Options

There are different deadline options for this project. Students who perform their
final submission via the `submit` command before the date/times listed below
automatically receive the associated Submission-Based (SB) extra credit. The late 
penalty does not start applying until after the final date listed. 

* **FRI 2021-11-19 (NOV 19) @ 11:55 PM EST (`+10` SB Extra Credit)**
* **SAT 2021-11-20 (NOV 20) @ 11:55 PM EST (`+5` SB Extra Credit)**
* **SUN 2021-11-21 (NOV 21) @ 11:55 PM EDT (`+0` SB Extra Credit)**

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

* **LO1.d:**	Use shell commands to compile new and existing software solutions that
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

Your goal is to implement a GUI application in Java using JavaFX 11 that displays a 
gallery of images based on the results of a search query to the 
[iTunes Search API](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/#searching).
This will require you to lookup things in Javadoc and apply your knowledge of
things like inheritance, polymorphism, and interfaces. The functional
and non-functional requirements for this project are outlined later in this 
document. Here is an example of what your program might look like:

![screenshot1](https://i.imgur.com/eUh0NbF.png)

Here are links to an animated version: 
[gifv](https://i.imgur.com/tdRDXM1.gifv), 
[gif](https://i.imgur.com/tdRDXM1.gif).

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
[CSCI 1302 Maven Tutorial](https://github.com/cs1302uga/cs1302-tutorials/blob/master/maven.md)
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
- [ ] On paper, hash out how you might store the list or lists of image URLs.
- [ ] Write a method to retreive the JSON response string for a query to the iTunes 
      Search API based on a query string.
- [ ] Write a method that returns a list of URL strings based on a JSON response
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
highest possible grade is 120 (due to extra credit).

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

  * **Menu (10 points):** The application needs to have a menu bar with a "File" menu. The
    only menu item that is required is one labeled "Exit" that exits your
    application gracefully when clicked by the user.

  * **Main Content (30 points):** The main content of the application is a collection
    of twenty (20) artwork images gathered via querying the iTunes Search API. The
    initial set of images should correspond to some default query. If the
    application is in "play mode", then every two (2) seconds, a random image 
    that is currently being displayed should be replaced with a random image 
    that is not currently being displayed (assuming more than 20 images are
    gathered from the response to the search query).
    
    * As mentioned, images are gathered by querying the iTunes Search API. We have included
      information [here](#query-how) on how to programmatically perform such
      a query. A query result should contain multiple artwork URLs that you can 
      use to download images. 
	  
    * Only a distinct set of URLs should used if there
      are any duplicates. Implementers are not expected to handle situations
      where two distinct URLs refer to identical images.

  * **Toolbar (50 points):** The application needs to have a toolbar. 
  
    **What is a toolbar?** A toolbar is a strip of components that allow a user
	to perform related actions in an application. In JavaFX, a toolbar can
	be implemented in several different ways, most of which involve some
	kind of 
	[layout pane](https://github.com/cs1302uga/cs1302-tutorials/blob/master/javafx/javafx-bookmarks.md#re-layout-panes). 

	**What to include:** Your toolbar, however implemented, must contain at least the 
	following components:

    * *Play/Pause Button (10 points):* This button should allow the user to 
      pause and resume the random image replacement described for the main 
      content of the application. The button text should change, as needed, 
      to reflect the current application mode (i.e., play vs. pause).

    * *Query Text Field (10 points):* This component should allow the user to 
      enter in a **term** that your application will use when it queries the 
	  iTunes Search API. Its initial contents should correspond to some default term 
	  of your choosing (e.g., `"jack johnson"`).

    * *Update Images Button (30 points):* This button should cause the application 
      to query the iTunes Search API using the URL-encoded version of the term
	  provided by the user in the query text field, download the images associated with
	  the query response, then update the images in the main content area of the 
	  application accordingly. 
	  
	  * Instructions for how to query to iTunes Search API are provided
	    [here](#query-how), including a description of the parameters 
		you can provide when performing a query. When your application performs
		a search query, **only the following parameters should be used:**
		
        | Parameter | Value                                                     |
        |-----------|-----------------------------------------------------------|
		| `term`    | URL-encoded version of the **term** provided by the user. |
		| `limit`   | `"200"`                                                   |
		| `media`   | `"music"`                                                 |
      
	  * If the application is currently in **play mode**, then it should temporarily
	    be placed into **pause mode** while query process is taking place, then
		places back into **play mode** once the query process is finished.
		
      * If **less than twenty one (21)** distinct artwork image URLs are available 
	    in the query response, then an alert dialog should be displayed to the 
		user with an appropriate error message. In this scenario, the images in
		the main content area should not be updated, and the application should
		resume in whatever mode it was in when the user clicked the "Update Images"
		button.
        
      * If **twenty one (21) or more** distinct artwork image URLs are available in
	    the query response, then all the images associated with those distinct URLs
		should be downloaded, and references to those downloaded images should be 
		stored in some kind of list. In this scenario, the main content area should 
		be updated to immediately display 20 of the downloaded images, and the
		application should resume in whatever mode it was in when the user clicked 
		the "Update Images" button. The remaining images should not be omitted as 
		they will be needed to facilitate the "random replacement" described 
		elsewhere in this document.

  * **Progress Bar (10 points):** The application needs to have a progress bar 
    that indicates the progress of querying the iTunes Search API, loading the
    images into memory, and updating the main content area of the application.
    
    * Ideally, the progress bar will be seen by users of the application to 
	  progress in two different scenarios:
	  
	  1. when the application first starts and images are gathered from the 
	     response to the default query; and 
		 
	  2. when the "Update Images" button is pressed and images are gathered
	     from the response to query constructed using the user's input. 
	  
	  **You are required to handle situation (2),** and you are encouraged
      to handle situation (1) if time permits.
      
    * Please note that **this progress bar is not merely aesthetic**. It 
      should actually show the progress of downloading the individual images
      from the query response.
      
    * In JavaFX, an image is represented by an [`Image`](https://openjfx.io/javadoc/11/javafx.graphics/javafx/scene/image/Image.html)
      object. When an `Image` object is constructed with content loaded from a
      specified URL (e.g., using the [`Image(String)`](https://openjfx.io/javadoc/11/javafx.graphics/javafx/scene/image/Image.html#%3Cinit%3E(java.lang.String))
      constructor, that is when the image data is downloaded. Here is a code
      snippet to consider: 
      
      ```java
      String bradUrl = "http://csweb.cs.uga.edu/~mec/cs1302/gui/brad.jpg";
      final Image bradImage = new Image(bradUrl);                 // first line
      Platform.runLater(() -> someImageView.setImage(bradImage)); // second line
      ```
      
      In the example above, the first line will take some time to download but does not modify the scene graph;
      however, the second line will take very little time but needs to run on the FX Application Thread 
      since it modifies the scene graph.
 
* **Extra Credit Opportunity (10 points):** Add a "Help" menu to the menu bar. This menu
  should contain one menu item labeled "About" that displays a stage or alert dialog
  titled "About YOUR-NAME" (where YOUR-NAME is replaced with your name). The scene or
  content of this stage or alert dialog should display an image of you as well as 
  your name, email, and the version number for your application 
  (version can be whatever you want). The stage or alert dialog should be 
  *application modal*, and it should be closable so that the user can return
  to the main part of the application. Please make sure the "Help" menu is the 
  right-most menu.

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
  
  If you follow this structure, then you might type the following to clean, compile, 
  and run your code using Maven, assuming you are in the top-level project directory:
  
  ```
  $ mvn clean
  ```
  
  ```
  $ mvn compile
  ```
  
  ```
  $ export MAVEN_OPTS=-Dprism.order=sw;
  $ mvn -e exec:java -Dexec.mainClass="cs1302.gallery.GalleryDriver"
  ```
  
  The following may also work to run the program:
  
  ```
  $ mvn -e -Dprism.order=sw exec:java -Dexec.mainClass="cs1302.gallery.GalleryDriver"
  ```
  
  If the `exec.mainClass` property is set appropriately (to `cs1302.gallery.GalleryDriver`) 
  in your POM, then the following may also work:
  
  ```
  $ mvn -e -Dprism.order=sw exec:java
  ```
  
  If you utilize daemon threads in your application, then the `-Dexec.cleanupDaemonThreads=false` option
  may also need to be added to honor the usual expectation that daemon threads do not block program
  termination. If you find that a daemon thread is preventing your app from terminating gracefully
  (or at all), then definitely use `-Dexec.cleanupDaemonThreads=false`. 
  
  ```
  $ mvn -e -Dprism.order=sw exec:java -Dexec.cleanupDaemonThreads=false
  ```
  
  We encourage you to include one or more of the lines above 
  [in a script](https://github.com/cs1302uga/cs1302-tutorials/blob/master/scripts/scripts.md) 
  so that you do not have to type it out every time.
  
* **Development Environment:** This project must be implemented 
  in Java 11, and it *must compile and run* correctly on Odin using the specific
  version of Java 11 that is setup according to the instructions provided
  by your instructor. For this requirement, the term *compile* should be 
  interpreted as *compile with no errors or warnings*.
  
  If you decide to introduce additional `.java` files into your project,
  then they are expected to fulfill all non-functional and absolute requirements, 
  even if the main parts of the project do not use them. This includes, but
  is not limited to the code style requirements. You may assume
  graders will compile your source code in an order that satisfies
  compilation dependencies. You should remove any `.java` files that you
  do not need before submission.
  
* **No FXML or use of Scene Builder:** FXML and SceneBuilder
  are advanced tools that are not currently covered in this course. Use of
  either for this project is prohibited. Please note that the project is
  not easier with these tools. In most cases, they actually make the
  project harder, especially since those topics have not been covered.

### Grading

The graders will compile and run your code on Odin using Maven. They will test
each of the functional and non-functional requirements and total up the points
earned. This project is worth 100 points. Students have an opportunity to earn
up to an additional 20 points via extra credit.

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

## JavaFX 11

* [JavaFX Bookmarks](https://github.com/cs1302uga/cs1302-tutorials/blob/master/javafx/javafx-bookmarks.md)
* [JavaFX CSS Reference Guide](https://openjfx.io/javadoc/11/javafx.graphics/javafx/scene/doc-files/cssref.html)
* [Styling UI Controls with CSS](https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/apply-css.htm)

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
   API service via a carefully contructed URL. Here is a an example of a query
   URL that searches for all 
   [Jack Johnson](https://en.wikipedia.org/wiki/Jack_Johnson_(musician))
   audio and video content (movies, 
   podcasts, music, music videos, audiobooks, short films, and tv shows):
   
   ```
   https://itunes.apple.com/search?term=jack+johnson&limit=200&media=music
   ```
   
   Here is a breakdown of the URL:
   
   | URL Component                     | Meaning                               |
   |-----------------------------------|---------------------------------------|
   | `https://itunes.apple.com/search` | Endpoint URL for the Search API       |
   | `?`                               | Denotes the start of the query string |
   | `term=jack+johnson`               | Parameter `key=value` pair            |
   | `&`                               | Denotes that an additional parameter is to follow |
   | `limit=200`                       | Parameter `key=value` pair            |
   | `&`                               | Denotes that an additional parameter is to follow |
   | `media=music`                     | Parameter `key=value` pair            |
   
   In this example, the parameters `term`, `limit`, and `media` are passed
   to the iTunes Search API along with their URL-encoded values (e.g., the user might
   enter the term `"jack johnson"` into the query text field, but the URL-encoded
   version `"jack+johnson"` is what is used in the URL string).
   
   If you want to read more about each parameter in the query URL, then refer to their
   entries in the 
   [iTunes Search API documentation](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/). 

   The response, i.e., the results for a particular query, are returned as
   a large string, formatted using JavaScript Object Notation (JSON). You _could_
   perform string manipulation to retrieve pieces of information from this 
   response string, however, we recommend using a third party library called Gson
   instead (more details on that later).
   
   **See the String:** You can see the giant JSON-formatted string by visiting
   one of your carefully constructed URLs for an iTunes Search API query. 
   Some web browsers may display the string directly, while others may attempt to 
   download it. You can see it on Odin using `wget` and `cat` 
   (or use `less` if you want scrolling):
   ```
   $ wget -qO- "https://itunes.apple.com/search?term=jack+johnson&limit=200&media=music" | cat
   ```
   If you want to see formatted JSON output (i.e., properly tabbled, newlines added, etc.),
   then you might pipe the output of `wget` into the Python `json.tool` module instead:
   ```
   $ wget -qO- "https://itunes.apple.com/search?term=jack+johnson&limit=200&media=music" | jq "."
   ```

   **URL-Encoding:** You may have noticed that we said `jack+johnson` is the URL-encoded
   value for `"jack johnson"`. When constructing a URL query string (i.e., anything after the `?` in a URL) in Java, 
   take special care that any values (e.g., the value of the `term` parameter) are
   [URL-encoded](https://en.wikipedia.org/wiki/Percent-encoding).
   
   URL-encoding is easily accomplished for you using the static `encode` method in
   [`URLEncoder`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/URLEncoder.html).
   You should use the non-deprecated overload of this method, supplying `"UTF-8"` for
   the name of the character encoding as noted in the method's API documentation.
   Here is an example that URL-encodes `"jack johnson"` into something that can be used
   in a URL query string:
   
   ```java
   URLEncoder.encode("jack johnson", "UTF-8"); // returns "jack+johnson"
   ```
   
   **IMPORTANT:** To be clear, you do **NOT** need to URL-encode the entire URL string; you only
   need to URL-encode the parameter values.

1. **How do I download the JSON result for a query?**

   Suppose you have a `String` object referred to by `sUrl` containing the 
   URL for an iTunes Search API query. In order to download the result, you 
   will need to create a [`URL`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/URL.html)
   object and a [`InputStreamReader`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStreamReader.html) 
   object as follows (exception handling may be needed):
   ```java
   String sUrl = // from a query
   URL url = new URL(sUrl);
   InputStreamReader reader = new InputStreamReader(url.openStream());
   ```
   **If you want the JSON response as a string (_not likely!_),** then you might use a
   [`BufferedReader`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/BufferedReader.html)
   to access the individual lines of the response. If you're simply parsing
   the JSON response using a third party library, then most support the
   use of the `InputStreamReader` directly.

1. **How do I parse the JSON result for a query?**

   Here is an example of a single long string, formatted using JSON, that was retrieved
   using code similar to what was presented in the previous FAQ question (as presented,
   it is quite unweildly):
   
   ```json
   {
    "resultCount":2,
    "results": [
      {"wrapperType":"track", "kind":"song", "artistId":909253, "collectionId":1440857781, "trackId":1440857786, "artistName":"Jack Johnson", "collectionName":"In Between Dreams (Bonus Track Version)", "trackName":"Better Together", "collectionCensoredName":"In Between Dreams (Bonus Track Version)", "trackCensoredName":"Better Together", "artistViewUrl":"https://music.apple.com/us/artist/jack-johnson/909253?uo=4", "collectionViewUrl":"https://music.apple.com/us/album/better-together/1440857781?i=1440857786&uo=4", "trackViewUrl":"https://music.apple.com/us/album/better-together/1440857781?i=1440857786&uo=4", "previewUrl":"https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview118/v4/94/25/9c/94259c23-84ee-129d-709c-577186cbe211/mzaf_5653537699505456197.plus.aac.p.m4a", "artworkUrl30":"https://is2-ssl.mzstatic.com/image/thumb/Music118/v4/24/46/97/24469731-f56f-29f6-67bd-53438f59ebcb/source/30x30bb.jpg", "artworkUrl60":"https://is2-ssl.mzstatic.com/image/thumb/Music118/v4/24/46/97/24469731-f56f-29f6-67bd-53438f59ebcb/source/60x60bb.jpg", "artworkUrl100":"https://is2-ssl.mzstatic.com/image/thumb/Music118/v4/24/46/97/24469731-f56f-29f6-67bd-53438f59ebcb/source/100x100bb.jpg", "collectionPrice":9.99, "trackPrice":1.29, "releaseDate":"2005-03-01T12:00:00Z", "collectionExplicitness":"notExplicit", "trackExplicitness":"notExplicit", "discCount":1, "discNumber":1, "trackCount":15, "trackNumber":1, "trackTimeMillis":207679, "country":"USA", "currency":"USD", "primaryGenreName":"Rock", "isStreamable":true}, 
      {"wrapperType":"track", "kind":"song", "artistId":909253, "collectionId":1440857781, "trackId":1440857795, "artistName":"Jack Johnson", "collectionName":"In Between Dreams (Bonus Track Version)", "trackName":"Banana Pancakes", "collectionCensoredName":"In Between Dreams (Bonus Track Version)", "trackCensoredName":"Banana Pancakes", "artistViewUrl":"https://music.apple.com/us/artist/jack-johnson/909253?uo=4", "collectionViewUrl":"https://music.apple.com/us/album/banana-pancakes/1440857781?i=1440857795&uo=4", "trackViewUrl":"https://music.apple.com/us/album/banana-pancakes/1440857781?i=1440857795&uo=4", "previewUrl":"https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview118/v4/51/ba/f8/51baf8ca-e417-56e8-d6e1-4f02634e451c/mzaf_5766837215935557210.plus.aac.p.m4a", "artworkUrl30":"https://is2-ssl.mzstatic.com/image/thumb/Music118/v4/24/46/97/24469731-f56f-29f6-67bd-53438f59ebcb/source/30x30bb.jpg", "artworkUrl60":"https://is2-ssl.mzstatic.com/image/thumb/Music118/v4/24/46/97/24469731-f56f-29f6-67bd-53438f59ebcb/source/60x60bb.jpg", "artworkUrl100":"https://is2-ssl.mzstatic.com/image/thumb/Music118/v4/24/46/97/24469731-f56f-29f6-67bd-53438f59ebcb/source/100x100bb.jpg", "collectionPrice":9.99, "trackPrice":1.29, "releaseDate":"2005-03-01T12:00:00Z", "collectionExplicitness":"notExplicit", "trackExplicitness":"notExplicit", "discCount":1, "discNumber":1, "trackCount":15, "trackNumber":3, "trackTimeMillis":191854, "country":"USA", "currency":"USD", "primaryGenreName":"Rock", "isStreamable":true}
    ]
   }
   ```

   Parsing JavaScript Object Notation (JSON) can be tricky, and there are many options. 
   You _could_ perform string manipulation to retrieve the various pieces of information 
   from this response string. However, your instructor
   recommends using Google's [`Gson`](https://github.com/google/gson) library.
   **Before you continue,** please do some due dilligence and lookup JSON. Given a 
   string formatted using JSON, various parts of the string are referred to as
   _objects_, _arrays_, _elements_, etc. 
   
   Let's assume you have an `InputStreamReader` object referred to by `reader`
   for the JSON response to the example query described in another question in this FAQ.
      
   1. You can parse the JSON response using the static `parseReader` method found in the
      [`JsonParser`](https://www.javadoc.io/doc/com.google.code.gson/gson/2.8.6/com.google.gson/com/google/gson/JsonParser.html) class.
      The method returns a reference to a [`JsonElement`](https://www.javadoc.io/doc/com.google.code.gson/gson/2.8.6/com.google.gson/com/google/gson/JsonElement.html)
      object representing the root of the response. In the example above, think of this
      as giving you access to that outer pair of curly braces. The code for this is,
      where `reader` refers to an [`InputStreamReader`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStreamReader.html)
      object (see the previous FAQ question) that can be used to download the string:
      
      ```java
      JsonElement je = JsonParser.parseReader(reader);
      ```
   
   1. After that, you can traverse the response using the methods described in
      the Google Gson API. Since this is probably all very new to you, I
      recommend printing `je` to standard output and comparing it to the output
      description provided by the iTunes Search API and the example above. 
   
   1. Since the first element is a JSON _object_, you will want to convert the 
      element to the appropriate datatype using a Gson method. The very first
      element/object in a JSON response string is often called the _root_. 
      Therefore, you might do the following to perform the conversion:
      
      ```java
      JsonObject root = je.getAsJsonObject();                      // root of response
      ```
   
   1. According to [iTunes Search API documentation](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/), 
      the root element contains a
      [`JsonArray`](https://www.javadoc.io/doc/com.google.code.gson/gson/2.8.6/com.google.gson/com/google/gson/JsonArray.html)
      called `results`. You can see it in the example string presented earlier! We can refer
      to this array using the following:
     
      ```java
      JsonArray results = root.getAsJsonArray("results");          // "results" array
      int numResults = results.size();                             // "results" array size
      ```
     
   1. You can get a particular element in the array, which represents an individual result, 
      using the `get` method as follows, where `i` is an `int` containing an index value:
      
      ```java
      JsonObject result = results.get(i).getAsJsonObject();
      ```
   
   1. Again, according to the [iTunes Search API documentation](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/), 
      each individual result _may_ have an `artworkUrl100` attribute/member. To access this, 
      you might do the following:
      
      ```
      JsonElement artworkUrl100 = result.get("artworkUrl100"); // artworkUrl100 member
      ```
      
      Be careful! If the `artworkUrl100` attribute/member may be `null`!
   
   That's it. If you want to access other parts of the response, you will need to combine
   information gathered by reading both the 
   [iTunes Search API documentation](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/)
   and the 
   [Google Gson API documentation](https://www.javadoc.io/doc/com.google.code.gson/gson).
   
1. **How can I use Google Gson in my project?**
   
   We have already added the Gson library to your project by adding its Maven dependency
   to your `pom.xml` file. At the time of this writing, version `2.8.6` is the version
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
   [`Thread`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Thread.html) object
   with a [`Runnable`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html) 
   implementation for your task. Since `Runnable` is a functional interface, 
   this process is simplified using a lambda expression or method reference. 
   Here is an example idiom of how to create and start a new thread for a task:
   ```java
   Runnable r = () -> {
       /* task code here */
   };
   Thread t = new Thread(r);
   t.setDaemon(true);
   t.start();
   ```
   The call to `t.setDaemon(true)` prevents this newly created thread from
   delaying program termination in the case where either the main thread
   or the JavaFX Application Thread terminate first. After the call to 
   `t.start()`, both the JavaFX Application Thread and the newly created 
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
   in a [`Runnable`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html)
   implementation and passed to the static `runLater` method in 
   [`Platform`](https://openjfx.io/javadoc/11/javafx.graphics/javafx/application/Platform.html).
   Since `Runnable` is a functional interface, this process is simplified using
   a lambda expression or method reference. Here is a basic example:
   ```java
   Runnable r = () -> {
       /* place code interacting with scene graph here */
   };
   Platform.runLater(r);
   ```
   The `runLater` method ensures that the code in your `Runnable` implementation 
   executes in the JavaFX Application Thread. Here is a more complete example 
   that combines this scenario with the one described in Q4 of this FAQ using the
   [`runNow`](#runNow) method to create and start a daemon thread for the overall
   task:
   ```java
   EventHandler<ActionEvent> handler = event -> {
       runNow(() -> {
           /* some 
            * task code 
            * here 
            */
           Platform.runLater(() -> { /* interact with scene graph */ });
           /* perhaps
            * more task code 
            * here 
            */
           Platform.runLater(() -> { /* interact with scene graph again */ });
           /* perhaps 
            * even more task code 
            * here 
            */
       });      
   };
   button.setOnAction(handler);
   ```
   
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

   <a name="timeline">The</a> easiest way to accomplish this in a JavaFX application is using the
   [`Timeline`](https://openjfx.io/javadoc/11/javafx.graphics/javafx/animation/Timeline.html) 
   and [`KeyFrame`](https://openjfx.io/javadoc/11/javafx.graphics/javafx/animation/KeyFrame.html) 
   classes. Here is an example that prints the current time (using 
   [`LocalTime`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalTime.html)) to 
   standard output every two (2) seconds (specified using
   [`Duration`](https://openjfx.io/javadoc/11/javafx.base/javafx/util/Duration.html), indefinitely:
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
   of reference variales around, perhaps through constructors. If it were one or two variables, 
   then it would not be a big deal. However, you are likely reading this question because you
   are passing a lot of variables around. Your first thought might be to make those variables 
   static, but that is not good for a couple different reasons--recall what it means for
   a variable to be static as well as the non-functional requirements for this project.
   Using static variables as a "go to" solution is an example of an anti-pattern, i.e.,  a 
   common response to a recurring problem that is usually ineffective and risks being highly 
   counterproductive.
   
   The reccommended strategy is to add all those variables to your `Application` subclass as 
   instance variables, then create getters / setters and higher level methods that interact
   with groups of variables in a controlled way. This will make the application object easier 
   to work with, promote encapsulation, and help enforce self-governance of the object. 
   When employing this strategy, you can then pass a reference to your application object around as needed.
   This way, you are only passing around one variable instead of many! In the other parts of your
   app (e.g., in custom components), simply call on the application object's methods to access and 
   change the things you were previously passing around.
   
   Remember, if you are currently in your application class's `start` method, then you can pass
   a reference to the current application object into a method using the `this` reference
   variable. 

1. **How do I access a local, non-downloaded resource (e.g., an image file)?**

   You should place local files under `resources` in your project directory (you may need to
   create the `resources` directory). URLs prefixed with `file:` should be relative to your
   project directory. 
   
   Example:
   
   | Resource                | URL                            |
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
