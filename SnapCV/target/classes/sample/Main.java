package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("styles/ResumeUI.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("styles/filestyle.css").toExternalForm());
        primaryStage.setTitle("CV Maker");
        primaryStage.show();
        primaryStage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
