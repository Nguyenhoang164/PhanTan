package com.example.moneytrans;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField money;

    @FXML
    protected void trans() {
        String TextInput = this.money.getText();
        double Money = Integer.parseInt(TextInput);
        int Prize = 23000;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        if (Money > Prize) {
           double value = Money / Prize;
            alert.setContentText((double) Math.ceil(value * 100)/100 + " dola");
            alert.show();
        } else {
            alert.setContentText("error");
            alert.show();
        }
    }
}