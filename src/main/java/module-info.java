module com.example.pinterest_workshop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.pinterest_workshop to javafx.fxml;
    exports com.example.pinterest_workshop;
}