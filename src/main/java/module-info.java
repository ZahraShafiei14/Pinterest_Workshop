module com.example.pinterest_workshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pinterest_workshop to javafx.fxml;
    exports com.example.pinterest_workshop;
}