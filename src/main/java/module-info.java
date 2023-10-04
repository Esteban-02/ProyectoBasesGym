module com.example.proyectogym {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectogym to javafx.fxml;
    exports com.example.proyectogym;
}