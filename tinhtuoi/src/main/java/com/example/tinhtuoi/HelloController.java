package com.example.tinhtuoi;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField age;

    @FXML
    protected void onHelloButtonClick() {
       int year = 2023;
       String result = age.getText();
       int answer = year - Integer.parseInt(result);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(String.valueOf(answer) + " tuoi ");
        alert.show();
    }
}