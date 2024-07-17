module com.oop.mahadi.akashdth1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.akashdth1 to javafx.fxml;
    exports com.oop.mahadi.akashdth1;
    exports com.oop.mahadi.akashdth1.tecnachianCintrollerReqVire;
    opens com.oop.mahadi.akashdth1.tecnachianCintrollerReqVire to javafx.fxml;
}