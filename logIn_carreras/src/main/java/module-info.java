module com.example.login_carreras {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.login_carreras to javafx.fxml;
    exports com.example.login_carreras;
}