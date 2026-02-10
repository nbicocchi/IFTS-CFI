module org.example.demobb {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demobb to javafx.fxml;
    exports org.example.demobb;
}