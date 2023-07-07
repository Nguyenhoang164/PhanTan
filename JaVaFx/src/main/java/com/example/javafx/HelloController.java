package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField input;

    @FXML
    protected void sign() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("answer");
        alert.setHeaderText("halo");
        alert.setContentText(input.getText());
        alert.show();
    }
}