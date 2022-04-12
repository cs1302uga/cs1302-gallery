/**
 * Provides the <strong>cs1302-gallery</strong> application.
 */
module cs1302.gallery {
    requires transitive java.logging;
    requires transitive java.net.http;
    requires transitive javafx.controls;
    requires transitive com.google.gson;
    opens cs1302.gallery;
} // module
