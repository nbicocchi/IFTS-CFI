module org.example.demobb {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens org.example.demobb to javafx.fxml;
    exports org.example.demobb;
}