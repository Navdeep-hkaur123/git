module com.example.hrmanagementnav {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.hrmanagementnav to javafx.fxml;
    exports com.example.hrmanagementnav;
}