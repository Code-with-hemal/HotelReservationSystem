module hotelmanagementsystem.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens hotelmanagementsystem.demo to javafx.fxml;
    exports hotelmanagementsystem.demo;
}