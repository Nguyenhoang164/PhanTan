package com.example.randomnumber;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField number;

    @FXML
    protected void onHelloButtonClick() {
        int max = 1;
        int min = 0;
        String numberText = this.number.getText();
        int Number = Integer.parseInt(numberText);
        int Random = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);;
        if (Number == Random){
            alert1.setContentText(" pro vl ");
            alert1.setHeaderText(String.valueOf(Random));
            alert1.show();
        }else{
            alert1.setContentText("ngu vl");
            alert1.setHeaderText(String.valueOf(Random));
            alert1.show();

        }
    }
}