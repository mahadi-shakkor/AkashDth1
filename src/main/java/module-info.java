module com.oop.mahadi.akashdth1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.akashdth1 to javafx.fxml;
    exports com.oop.mahadi.akashdth1;
    exports com.oop.mahadi.akashdth1.TecnachianDashBoaedController;
    opens com.oop.mahadi.akashdth1.TecnachianDashBoaedController to javafx.fxml;
    exports com.oop.mahadi.akashdth1.CoustomerBuyPacageCcontroller;
    opens com.oop.mahadi.akashdth1.CoustomerBuyPacageCcontroller to javafx.fxml;

    exports com.oop.mahadi.akashdth1.TecnachianViewCustomerProfileContoller;
    opens com.oop.mahadi.akashdth1.TecnachianViewCustomerProfileContoller to javafx.fxml;

}