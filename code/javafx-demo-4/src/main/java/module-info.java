module org.example.demobb {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens org.example.demobb to javafx.fxml;
    exports org.example.demobb;
    exports org.example.demobb.persistence.model;
    opens org.example.demobb.persistence.model to javafx.fxml;
}