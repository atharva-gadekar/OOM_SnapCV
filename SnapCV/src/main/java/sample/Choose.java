package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Choose implements Initializable {

    @FXML
    public Button Gen;

    @FXML
    public Button Gen2;
    @FXML
    private TextField FirstName;

    @FXML
    private TextField LastName;

    @FXML
    private TextField Phone;

    @FXML
    private TextField LinkedIn;

    @FXML
    private TextField EmailId;

    @FXML
    public Button closeButton;

    @FXML
    public Button Save;


    public void GenResume(ActionEvent event) throws IOException{
        GenerateResume.Template= "1";
        Stage stage = (Stage) Gen.getScene().getWindow();
        stage.close();
    }

    public void GenResume2(ActionEvent event) throws IOException{
        GenerateResume.Template= "2";
        Stage stage = (Stage) Gen2.getScene().getWindow();
        stage.close();
    }

    public void GenResume3(ActionEvent event) throws IOException{
        GenerateResume.Template= "3";
        Stage stage = (Stage) Gen2.getScene().getWindow();
        stage.close();
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        FirstName.setText(GenerateResume.FirstName);
//        LastName.setText(GenerateResume.LastName);
//        Phone.setText(GenerateResume.Phone);
//        EmailId.setText(GenerateResume.Email);
//        LinkedIn.setText(GenerateResume.LinkedIn);
    }
}