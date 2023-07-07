package com.example.computer;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    TextField number1;
    @FXML
    TextField number2;
    @FXML
    TextField sattus;



    @FXML
    protected void Check() {
       String Number1 = number1.getText();
       String Number2 = number2.getText();
       double num1 = Double.parseDouble(Number1);
       double num2 = Double.parseDouble(Number2);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        String Status = sattus.getText();
        switch (Status) {
            case "+" -> {
                double Value = num1 + num2;
                alert.setContentText(String.valueOf(Value));
                alert.show();
                number1.setText(String.valueOf(Value));
                number2.setText(null);
                sattus.setText(null);
            }
            case "-" -> {
                double Value = num1 - num2;
                alert.setContentText(String.valueOf(Value));
                alert.show();
                number1.setText(String.valueOf(Value));
                number2.setText(null);
                sattus.setText(null);
            }
            case "*" -> {
                double Value = num1 * num2;
                alert.setContentText(String.valueOf(Value));
                alert.show();
                number1.setText(String.valueOf(Value));
                number2.setText(null);
                sattus.setText(null);
            }
            case "/" -> {
                double Value = num1 / num2;
                alert.setContentText(String.valueOf(Value));
                alert.show();
                number1.setText(String.valueOf(Value));
                number2.setText(null);
                sattus.setText(null);
            }
            default -> {
                Alert alert1 = new Alert(Alert.AlertType.ERROR);
                alert1.show();
                number1.setText(null);
                number2.setText(null);
                sattus.setText(null);
            }
        }

    }
    @FXML
    protected void Delete(){
        number1.setText(null);
        number2.setText(null);
        sattus.setText(null);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Thong bao ");
        alert.setContentText("xoa thanh cong phan tu");
        alert.show();
    }
}