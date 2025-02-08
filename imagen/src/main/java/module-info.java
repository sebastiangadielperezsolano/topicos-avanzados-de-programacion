module com.example.imagen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens com.example.imagen to javafx.fxml;
    exports com.example.imagen;
}