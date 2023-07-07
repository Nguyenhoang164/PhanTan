module com.example.computer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.computer to javafx.fxml;
    exports com.example.computer;
}