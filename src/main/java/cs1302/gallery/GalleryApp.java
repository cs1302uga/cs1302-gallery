package cs1302.gallery;

import java.net.http.HttpClient;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Represents an iTunes Gallery App.
 */
public class GalleryApp extends Application {

    /** HTTP client. */
    public static final HttpClient HTTP_CLIENT = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_2)           // uses HTTP protocol version 2 where possible
        .followRedirects(HttpClient.Redirect.NORMAL)  // always redirects, except from HTTPS to HTTP
        .build();                                     // builds and returns a HttpClient object

    /** Google {@code Gson} object for parsing JSON-formatted strings. */
    public static Gson GSON = new GsonBuilder()
        .setPrettyPrinting()                          // enable nice output when printing
        .create();                                    // builds and returns a Gson object

    /** {@inheritDoc} */
    @Override
    public void start(Stage stage) {
        HBox pane = new HBox();
        Scene scene = new Scene(pane);
        stage.setMaxWidth(640);
        stage.setMaxHeight(480);
        stage.setTitle("GalleryApp!");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    } // start

} // GalleryApp
