module com.oop.mahadi.akashdth1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.akashdth1 to javafx.fxml;
    exports com.oop.mahadi.akashdth1;
    exports com.oop.mahadi.akashdth1.TecnachianCanSeeServiceReqGoalControllers;
    opens com.oop.mahadi.akashdth1.TecnachianCanSeeServiceReqGoalControllers to javafx.fxml;
    exports com.oop.mahadi.akashdth1.CoustomerBuyPacageCcontroller;
    opens com.oop.mahadi.akashdth1.CoustomerBuyPacageCcontroller to javafx.fxml;

    exports com.oop.mahadi.akashdth1.TecnachianViewCustomerProfileContoller;
    opens com.oop.mahadi.akashdth1.TecnachianViewCustomerProfileContoller to javafx.fxml;
    exports com.oop.mahadi.akashdth1.TecnachianGeneralController;
    opens com.oop.mahadi.akashdth1.TecnachianGeneralController to javafx.fxml;

}