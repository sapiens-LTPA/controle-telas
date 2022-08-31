module com.example.controletelas {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.sapiens to javafx.fxml;
    exports br.sapiens;

    opens br.sapiens.modelo to javafx.fxml;
    exports br.sapiens.modelo;

    exports br.sapiens.controllers;
    opens br.sapiens.controllers to javafx.fxml;

    opens br.sapiens.core to javafx.fxml;
    exports br.sapiens.core;

    exports br.sapiens.controllers.layout;
    opens br.sapiens.controllers.layout to javafx.fxml;
}