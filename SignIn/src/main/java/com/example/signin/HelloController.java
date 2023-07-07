package com.example.signin;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField username;
    @FXML
    PasswordField passw;

    @FXML
    protected void add() {
        String user = this.username.getText();
        String pass = this.passw.getText();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (user.equals("kamito") && pass.equals("l")){
            alert.setContentText("Thanh cong");
            alert.show();
        }else{
            alert.setContentText("That bai");
            alert.show();
        }
    }
}