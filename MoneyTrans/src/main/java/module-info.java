module com.example.moneytrans {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moneytrans to javafx.fxml;
    exports com.example.moneytrans;
}