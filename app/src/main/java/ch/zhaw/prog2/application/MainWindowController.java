package ch.zhaw.prog2.application;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class MainWindowController {
    @FXML
private TextArea textHistory;
    @FXML
private TextField textEingabe;
    @FXML
private Label lableTitel;

public void initialize(){
    connectProperties();
}
public void connectProperties(){
    lableTitel.textProperty().bind(textEingabe.textProperty());
}
    @FXML
    public void hinzufuegenText(javafx.event.ActionEvent actionEvent) {
        textHistory.setText(textHistory.getText()+textEingabe.getText()+System.lineSeparator());
    }
    @FXML
    public void leerenTextEingabe(javafx.event.ActionEvent actionEvent) {
        textEingabe.clear();
    }
}
