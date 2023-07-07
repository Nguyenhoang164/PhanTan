package com.example.bmi;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField chieucao;
    @FXML
    TextField cannang;
    @FXML
    protected void Check() {
        String Tall = this.chieucao.getText();
        String Weight = this.cannang.getText();
        double tall = Double.parseDouble(Tall);
        double weight = Double.parseDouble(Weight);
         double Bmi = weight / (tall * tall);
         double Bmimin = (double) Math.floor(Math.ceil(Bmi *100))/100;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (Bmi < 18.5){
            alert.setContentText(" nhe can ");
            alert.setHeaderText(String.valueOf(Bmimin));
            alert.show();
        } else if (Bmi <= 25 ) {
            alert.setContentText(" binh thuong ");
            alert.setHeaderText(String.valueOf(Bmimin));
            alert.show();
        } else if (Bmi <= 29.9) {
            alert.setContentText("beo phi cap 1");
            alert.setHeaderText(String.valueOf(Bmimin));
            alert.show();
        } else if (Bmi <= 30) {
            alert.setContentText("beo phi cap 2");
            alert.setHeaderText(String.valueOf(Bmimin));
            alert.show();
        }else{
            alert.setContentText("beo phi cap 3");
            alert.setHeaderText(String.valueOf(Bmimin));
            alert.show();
        }
    }
}