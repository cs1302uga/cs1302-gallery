
# CSCI 1302 - Gallery

This document contains the description for the `cs1302-gallery` project
assigned to the students in the Fall 2018 CSCI 1302 classes
at the University of Georgia.

**DUE TUE 2018-11-06 (NOV 6) @ 11:55 PM EDT**.

**Please read the entirety of this file before
beginning your project, including the FAQ in
the Appendix.** 

## Table of Contents

* [Academic Honesty](#academic-honesty)
* [Updates](#updates)
* [Project Description](#project-description)
* [Project Requirements & Grading](#project-requirements--grading)
  * [Functional Requirements](#functional-requirements)
  * [Non-Functional Requirements](#non-functional-requirements)
* [How to Download the Project](#how-to-download-the-project)
* [Submission Instructions](#submission-instructions)
* [Appendix - Useful Links](#appendix---useful-links)
* [Appendix - FAQ](#appendix---faq)

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

* 2018-10-24 WED Updated the FAQ.

## Project Description

Your goal is to implement a GUI application in Java using JavaFX 8 that displays a 
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

* Plan, design, implement, test, debug, and deploy a complete object-oriented
  software solution in Linux/Unix environment (1302-LO1)
* Utilitze inheritance and polymorphism in a software project (1302-LO3-LO4).
* Develop a GUI for a software project (1302-LO7).
* Implement exception-handling in a software project (1302-LO8).
* Understand and apply langauge basics using an OOP language (1302-LO11).

## Project Requirements & Grading

This assignment is worth 100 points. The lowest possible grade is 0, and the 
highest possible grade is 110 (due to extra credit).

### Functional Requirements

* **Main Requirements (100 points):** Your application needs to have the components 
  listed below. They need to function as described. If a certain aspect of a component 
  (e.g., style or behavior) is not specified in these requirements, then that
  aspect is at the discretion of the implementor. The screenshot provided earlier 
  in this project description is meant to serve as a reference. It is okay if
  implementors deviate visually from screenshot. In addition to the required 
  components, implementors should feel free to add more components and/or 
  functionality as long they do not distract too heavily from the functionality
  of the required components. Here are the required components:

  * **Menu (10 points):** The application needs to have a menu bar with a "File" menu. The
    only menu item that is required is one labeled "Exit" that exits your
    application gracefully when clicked by the user.

  * **Main Content (30 points):** The main content of the application is a collection
    of twenty (20) images gathered via querying the iTunes Search API. The
    initial set of images should correspond to some default query. If the
    application is in "play mode", then every two (2) seconds, a random image 
    that is currently being displayed should be replaced with a random image 
    that is not currently being displayed (assuming more than 20 images are
    gathered from the response to the search query).

  * **Toolbar (50 points):** The application needs to have a toolbar that 
    contains the following components:

    * *Play/Pause Button (10 points):* This button should allow the user to 
      pause and resume the random image replacement described for the main 
      content of the application. The button text should change, as needed, 
      to reflect the current application mode (i.e., play vs. pause).

    * *Query Text Field (10 points):* This component should allow the user to 
      enter in a search query for the iTunes Search API. Its initial contents 
      should correspond to some default query. 

    * *Update Images Button (30 points):* This button should cause the application 
      to execute the search query specified in the query text field, gather
      the images associated with the query response, and update the images
      in the main content area of the application accordingly. If less than
      twenty one (21) images are gathered, then a dialog should be displayed to
      the user with an appropriate error message, and the main content area
      should not be updated. If twenty one (21) or more images are gathered, 
      then the images not chosen for display in the main content area of the
      application should be remembered in order to facilitate the random
      replacement described for the main content of the application.

  * **Progress Bar (10 points):** The application needs to have a progress bar 
    that indicates the progress of querying the iTunes Search API, loading the
    images into memory, and updating the main content area of the application.
    Notably, the progress bar will be seen to progress when the application
    first starts (as images are gathered from the response to the default
    query) and when the "Update Images" button is pressed. Please note that this
    progress bar is not merely aesthetic. It should actually show the progress
    of gathering individual images from the query response. 

* **Extra Credit 1 (5 points):** Add a "Help" menu to the menu bar. This menu
  should contain one menu item labeled "About" that displays an "About YOUR-NAME"
  window (where YOUR-NAME is replaced with your name). This window should
  contain an image of you as well as your name, email, and the version number
  for your application (version can be whatever you want). This window should
  be *application modal*, and it should be closable so that the user can return
  to the main part of the application. If you are doing both of the extra
  credit requirements, then please make the "Help" menu the right-most menu

* **Extra Credit 2 (5 points):** Add a "Theme" menu to the menu bar that lets
  the user switch between different stylings for the application. In order to
  receive points for this requirement, you should support at least one theme
  in addition to your application's default theme. HINT: You may want to explore
  having muliple CSS files for your application and loading/applying them as
  needed to facilitate this requirement.

### Non-Functional Requirements

Points indicated for non-functional requirements are not added to the grade total
if satisfied but are subtracted from the grade total if not satisfied.

* **(100 points) Project Structure:** The location of the default
  package for the source code should be a direct subdirectory called `src/main/java`.
  When the project is compiled using Maven, the the default package for compiled 
  code should be `target/classes`. 
  
  If you follow this structure, then you might type the following to compile 
  your code, assuming you are in the top-level project directory:
  ```
  $ mvn compile
  ```
  
  The driver class should be `cs1302.gallery.GalleryApp`.

* **(100 points) Development Environment:** This project must be implemented 
  in Java 8, and it *must compile and run* correctly on Nike using the specific
  version of Java 8 that is setup according to the instructions provided
  by your instructor (usually provided in the first homework assignment).
  
* **(100 points) No Static Variables:** Use of static variables is 
  not allowed for this assignment. Static constants are allowed. 
  
* **(100 points) No FXML or use of Scene Builder:** FXML and SceneBuilder
  are advanced tools that are not currently covered in this course. Use of
  either for this project is prohibited. Please note that the project is
  not easier with these tools. In most cases, they actually make the
  project harder, especially since those topics have not been covered.
  
* **(25 points) User-Friendly Experience:** Except for reasonable delays resulting from X forwarding, 
  your application should not hang/freeze or crash during execution.
  
* **(25 points) Code Style Guidelines:** You should be consistent with the style 
  aspect of your code in order to promote readability. Besides consistency, the
  following conventions will be enforced:
  
  * **Reference type names are written in _UpperCamelCase_.** Class names are  
    typically nouns or noun phrases. For example, `Character` or `ImmutableList`. 
    Interface names may also be nouns or noun phrases (for example, `List`), but 
    may sometimes be adjectives or adjective phrases instead (for example, 
    `Readable`).
  
  * **Method names are written in _lowerCamelCase_.** Method names are also 
    typically verbs or verb phrases. For example, `sendMessage` or `stop`.
  
  * **Braces are always used where optional.** Braces should be used with `if`, 
    `else`, `for`, `do`, and `while` statements, even when the body is empty or 
    contains only a single statement. Single line lambda expressions are
    permitted. 
    
  * **Column limit: 100.** You should limit the number of characters, including
    whitespace, on any given line to 100 characters. Except as noted below, any 
    line that would exceed this limit must be manually line-wrapped in a
    consistent manner. Exceptions to the column limit include:
    
    * Lines where obeying the column limit is not possible (for example, a long 
      URL in Javadoc, or a long JSNI method reference).
    * In `package` and `import` statements.
    * Command line input examples in a comment that may be cut-and-pasted into 
      a shell.
      
  * **Method height <= window height.** You should limit the number of lines for
    a method so that the entire method can be seen on the screen at once. This
    includes the line(s) with the method's signature and opening curly brace, all
    lines in the body of the mthod (including blank lines), and the line with
    the method's ending curly brace. 
    
    Of all the style guidelines, this is the probably the most subjective and 
    hardest to grade because everyone might have a different window size due
    to different terminal emulator and physical screen size configurations. 
    Therefore, graders will be checking for compliance with the spirit
    of this guideline, which is: methods that are too big and/or repetitive 
    should be refactored to include proper looping constructs and/or broken
    up into smaller methods to improve readability. 

* **(25 points) Javadoc Documentation:** Each method and class needs to be fully
  documented using Javadoc comments. Your comment should provide a description
  of the method's functionality in the first sentence of the comment.  This sentence
  needs to be a gramatically correct English sentence with proper punctuation. Further 
  description can be provided in subsequent sentence. The basic formatting of Javadoc 
  blocks is as seen in this example:
  ```java
  /**
   * Multiple lines of Javadoc text are written here,
   * wrapped normally...
   */
  public int method(String p1) { ... }
  ```
  ... or in this single-line example:
  ```java
  /** An especially short bit of Javadoc. */
  ```
  All method parameters and exceptions need to be documented.
  More information about Javadoc can be found
  [here](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/javadoc.html).

* **(25 points) In-line Documentation:** Code blocks should be adequately documented
  using in-line comments. This is especially necessary when a block of code
  is not immediately understood by a reader (e.g., yourself or the grader).

### Grading

The graders will compile and run your code on Nike using Maven. They will test
each of the functional and non-functional requirements and total up the points
earned. This project is worth 100 points. Students have an opportunity to earn
an additional 10 points via extra credit. 

## How to Download the Project

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

# Appendix - Useful Links

## JavaFX 8

* [Package: `javafx`](https://docs.oracle.com/javase/8/javafx/api/toc.htm)
* [JavaFX CSS Reference Guide](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/doc-files/cssref.html)
* [Styling UI Controls with CSS](https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/apply-css.htm)

## Third Party APIs and Libraries

* [iTunes Search API](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/)
* [Google Gson Library](https://github.com/google/gson)

## Other

* [JavaScript Object Notation (JSON)](https://en.wikipedia.org/wiki/JSON)
* [URL Encoding](https://en.wikipedia.org/wiki/Percent-encoding)

# Appendix - FAQ

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

   When constructing a query string in Java, take special care that the
   search term is [URL-encoded](https://en.wikipedia.org/wiki/Percent-encoding).
   This can be easily accomplished for you using the static `encode` method in
   [`URLEncoder`](https://docs.oracle.com/javase/7/docs/api/java/net/URLEncoder.html).

2. **How do I download the JSON result for a query?**

   Suppose you have a `String` object referred to by `sUrl` containing the 
   URL for an iTunes Search API query. In order to download the result, you 
   will need to create a [`URL`](https://docs.oracle.com/javase/8/docs/api/java/net/URL.html)
   object and a [`InputStreamReader`](https://docs.oracle.com/javase/8/docs/api/?java/io/InputStreamReader.html) 
   object as follows:
   ```java
   URL url = new URL(sUrl);
   InputStreamReader reader = new InputStreamReader(url.openStream());
   ```
   If you want the JSON response as a string, then you might use a
   [`BufferedReader`](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html)
   to access the individual lines of the response. If you're simply parsing
   the JSON response using a third party library, then most support the
   use of the `InputStreamReader` directly.

3. **How do I parse the JSON result for a query?**

   Parsing JSON can be tricky, and there are many options. Your instructor
   recommends using Google's [`Gson`](https://github.com/google/gson) library.
   Let's assume you have an `InputStreamReader` object referred to by `reader`
   for the JSON response to the example query described in Q1 of this FAQ.
   First, you will need to create a [`JsonParser`](https://google.github.io/gson/apidocs/com/google/gson/JsonParser.html)
   object:
   ```java
   JsonParser jp = new JsonParser();
   ```
   Then, you can parse the JSON response using the `parse` method to return
   the [`JsonElement`](https://google.github.io/gson/apidocs/com/google/gson/JsonElement.html)
   object representing the root of the response:
   ```java
   JsonElement je = jp.parse(reader);
   ```
   After that, you can traverse the response using the methods described in
   the Google Gson API. Since this is probably all very new to you, I
   recommend printing `je` to standard output and comparing it to the output
   description provided by the iTunes Search API. Also, here is a short code
   snippet (without error checking) that prints the art URLs associated with 
   the JSON response for the example query:
   ```java
   JsonObject root = je.getAsJsonObject();                      // root of response
   JsonArray results = root.getAsJsonArray("results");          // "results" array
   int numResults = results.size();                             // "results" array size
   for (int i = 0; i < numResults; i++) {                       
       JsonObject result = results.get(i).getAsJsonObject();    // object i in array
       JsonElement artworkUrl100 = result.get("artworkUrl100"); // artworkUrl100 member
       if (artworkUrl100 != null) {                             // member might not exist
            String artUrl = artworkUrl100.getAsString();        // get member as string
            System.out.println(artUrl);                         // print the string
       } // if
   } // for
   ```
   
   You can add the Gson library to your project by adding its Maven dependency
   to your `pom.xml` file. Search for `com.google.code.gson` on 
   [`Maven Central`](http://search.maven.org/) for the exact dependency
   information that needs to be added to your `pom.xml` file. At the time of
   this writing, version `2.8.5` is the most recent version available and is
   considered stable. 

   The HTML Javadoc documentation for the Google Gson API can be found 
   [here](https://google.github.io/gson/apidocs/).

4. **How do I make my application not freeze/hang when executing long running event handlers?**

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
   called the "JavaFX Event Dispatch" thread. By default, any code 
   executed by or in response to your GUI components (e.g., the code for an 
   event handler) takes place in the JavaFX Event Dispatch Thread. If you 
   do not want your program to hang, then you will need to create a 
   separate thread for your problematic code snippets. This works because 
   a Java program can have multiple threads executing concurrently. 

   Although we have been using "problematic code" to describe the code 
   snippet causing the problem, such a code snippet really represents some 
   "task" that you want your application to perform without hanging. 
   Therefore, I will try to use "task" throughout the remainder of this 
   response.

   To create a new thread, you need to instatiate a 
   [`Thread`](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html) object
   with a [`Runnable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html) 
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
   or the JavaFX Event Dispatch thread terminate first. After the call to 
   `t.start()`, both the JavaFX Event Dispatch Thread and the newly created 
   thread are executing concurrently. You cannot assume that statements in 
   either thread execute in any predetermined order. When writing an event 
   handler that executes a task, you might do something like the following:
   ```java
   EventHandler<ActionEvent> handler = event -> {
       Runnable r = () -> {
           /* task code here */
       };
       Thread t = new Thread(r);
       t.setDaemon(true);
       t.start();
   };
   button.setOnAction(handler);
   ```
   If you understand the code snippet above, then you might instead write it
   more concisely as follows:
   ```java
   button.setOnAction(event -> {
       Thread t = new Thread(() -> {
           /* task code here */
       });
       t.setDaemon(true);
       t.start();
   });
   ```
   
   **Advanced:** The solution presented above is probably the simplest.
   Alternatively, you can make use of some of the classes in the 
   [`javafx.concurrent`](https://docs.oracle.com/javase/8/javafx/api/javafx/concurrent/package-summary.html) package, 
   which provide, among other things, the ability to control the execution and 
   track the progress of code that is deferred to another thread. For more information,
   please see the [Concurrency in JavaFX](https://docs.oracle.com/javase/8/javafx/interoperability-tutorial/fx_concurrency.htm)
   tutorial. 

5. **What does "Not on FX application thread" mean and how do I fix it?**

   Usually an `IllegalStateException` with the message "Not on FX application thread"
   means that you are trying to access or modify some node (i.e., a component
   or container) in the scene graph from a code snippet that is not executing
   in the JavaFX Event Dispatch thread (see Q4 in this FAQ). If you want to fix this, then
   the code snippet that interacts with the scene graph needs to be wrapped
   in a [`Runnable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)
   implementation and passed to the static `runLater` method in 
   [`Platform`](https://docs.oracle.com/javase/8/javafx/api/javafx/application/Platform.html).
   Since `Runnable` is a functional interface, this process is simplified using
   a lambda expression or method reference. Here is a basic example:
   ```java
   Runnable r = () -> {
       /* place code interacting with scene graph here */
   };
   Platform.runLater(r);
   ```
   The `runLater` method ensures that the code in your `Runnable` implementation 
   executes in the JavaFX Event Dispatch thread. Here is a more complete example 
   that combines this scenario with the one described in Q4 of this FAQ:
   ```java
   EventHandler<ActionEvent> handler = event -> {
       Runnable r = () -> {
           /* some task code here */
           Platform.runLater(() -> { /* interact with scene graph */ });
           /* perhaps more task code here */
           Platform.runLater(() -> { /* interact with scene graph again */ });
           /* perhaps even more task code here */
       };
       Thread t = new Thread(r);
       t.setDaemon(true);
       t.start();       
   };
   button.setOnAction(handler);
   ```
   If you understand the code snippet above, then you might instead write it
   more concisely as follows:
   ```java
   button.setOnAction(event -> {
       Thread t = new Thread(() -> {
           /* some task code here */
           Platform.runLater(() -> { /* interact with scene graph */ });
           /* perhaps more task code here */
           Platform.runLater(() -> { /* interact with scene graph again */ });
           /* perhaps even more task code here */
       });
       t.setDaemon(true);
       t.start();       
   });
   ```
   While it might be tempting to place all of your task code in the
   `Runnable` implementation provided to `runLater`, that is not a good idea
   because it will be executed on the JavaFX Event Dispatch thread. If you
   already writing code for another thread, it was likely to avoid having it
   run on the JavaFX Event Dispatch Thread. Multiple calls to the `runLater` 
   method can be used, as needed, to ensure only the code that interacts with 
   the scene graph is executed in the JavaFX Event Dispatch thread.

6. **How do I make a code snippet execute repeatedly with a delay between executions?**

   The easiest way to accomplish this in a JavaFX application is using the
   [`Timeline`](https://docs.oracle.com/javase/8/javafx/api/javafx/animation/Timeline.html) 
   and [`KeyFrame`](https://docs.oracle.com/javase/8/javafx/api/javafx/animation/KeyFrame.html) 
   classes. Here is an example that prints the current time (using 
   [`LocalTime`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html)) to 
   standard output every two (2) seconds (specified using
   [`Duration`](https://docs.oracle.com/javase/8/javafx/api/javafx/util/Duration.html)), indefinitely:
   ```java
   EventHandler<ActionEvent> handler = event -> System.out.println(LocalTime.now());
   KeyFrame keyFrame = new KeyFrame(Duration.seconds(2), handler);
   Timeline timeline = new Timeline();
   timeline.setCycleCount(Timeline.INDEFINITE);
   timeline.getKeyFrames().add(keyFrame);
   timeline.play();
   ```
   The `Timeline` object also hase a `pause` method to pause the execution of the timeline.
   
7. **How do I pass around objects effectively?**

   From time to time, you may need to access one part of your app from another part of your app.
   You used a good design (e.g., classes and inheritance), but you find that you're passing a lot
   of reference variales around, perhaps through constructors. If it were one or two variables, 
   then it would not be a big deal. However, you are likely reading this question because you
   are passing a lot of variables around. Your first thought might be to make those variables 
   static, but that is not good for a couple different reasons--recall what it means for
   a variable to be static as well as the non-functional requirements for this project.
   
   The reccommended strategy is to add all those variables to your driver class as instance variables
   with getters and setters, then pass a reference to your driver object around as needed.
   This way, you are only passing around one variable instead of many! In the other parts of your
   app, simply call on the getter and setters methods to access and change the things you 
   were previously passing around.
   
   Remember, if you are currently in your driver class's `start` method, then you can pass
   a reference to the current driver object into a method using the `this` reference
   variable. 

Have a question? Please post it on the course Piazza.

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
