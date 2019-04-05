package cs1302.gallery;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** 
 * Represents an iTunes GalleryApp!
 */
public class GalleryApp extends Application {

    /** {@inheritdoc} */
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

