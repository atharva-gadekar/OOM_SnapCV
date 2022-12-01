package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import javafx.beans.value.ChangeListener;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.web.WebEngine;
import static javafx.concurrent.Worker.State;

import java.io.File;
import java.io.IOException;
import java.util.Random;

//Add the functionality to save the text field on given data

public class MainController {

    @FXML
    public Button Gen;
    @FXML
    public Button PersonalInfo;
    @FXML
    public Button Education;
    @FXML
    public Button WorkExp;
    @FXML
    public Button Skills;
    @FXML
    public Button Project;
    @FXML
    public Button Achievement;

    @FXML
    public Button FileLocation;

    @FXML
    public AnchorPane anchor;

    @FXML
    private TextField fileloc;


    public void Personalinfo(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/PersonalInfof.fxml"));
        Stage stage = new Stage();
        stage.setTitle("PersonalInformation");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Education(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/Education.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Education");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Skill(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/Skill.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Skills");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void WorkExp(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/WorkExp.fxml"));
        Stage stage = new Stage();
        stage.setTitle("WorkExp");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Project(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/Project.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Projects");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Achievement(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/Achievement.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Achievements");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Choose(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/Choose.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Choose");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Help(ActionEvent event) throws IOException{

        // Create the WebView
        WebView webView = new WebView();

        // Create the WebEngine
        final WebEngine webEngine = webView.getEngine();

        // LOad the Start-Page
        webEngine.load("https://youtu.be/dQw4w9WgXcQ");

        Stage stage = new Stage();

        // Update the stage title when a new web page title is available
        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<State>()
        {
            public void changed(ObservableValue<? extends State> ov, State oldState, State newState)
            {
                if (newState == State.SUCCEEDED)
                {
                    //stage.setTitle(webEngine.getLocation());
                    stage.setTitle(webEngine.getTitle());
                }
            }
        });

        // Create the VBox
        VBox root = new VBox();
        // Add the WebView to the VBox
        root.getChildren().add(webView);

        // Set the Style-properties of the VBox
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        // Create the Scene
        Scene scene = new Scene(root);
        // Add  the Scene to the Stage
        stage.setScene(scene);
        // Display the Stage
        stage.show();
    }

    public void GenResume(ActionEvent event) throws IOException{

        GenerateResume.main(null);
        Stage stage = (Stage) Gen.getScene().getWindow();
        stage.close();
    }

    public void Browse(ActionEvent event) throws IOException{
        final DirectoryChooser dir = new DirectoryChooser();
        Stage stage = (Stage)anchor.getScene().getWindow();
        File file = dir.showDialog(stage);
        String x = file.getAbsolutePath();
        fileloc.setText(x);
        GenerateResume.destination = x;
    }
}