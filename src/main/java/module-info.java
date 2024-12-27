module com.screen.screenvideo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.screen.screenvideo to javafx.fxml;
    exports com.screen.screenvideo;
}