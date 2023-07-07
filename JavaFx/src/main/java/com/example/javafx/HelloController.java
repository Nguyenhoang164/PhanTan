package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField textInput;

    public void showTextInput() {
        int currentYear = 2023;
        String inputYear = textInput.getText();
        int result = currentYear - Integer.parseInt(inputYear);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Tuoi cua ban");
        alert.setContentText(String.valueOf(result) + " tuoi");
        alert.show();
    }
}