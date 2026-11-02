module com.mycompany.projek.kalkulator.bmi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.projek.kalkulator.bmi to javafx.fxml;
    opens com.mycompany.projek.kalkulator.bmi.model to javafx.fxml;

    exports com.mycompany.projek.kalkulator.bmi;
    exports com.mycompany.projek.kalkulator.bmi.model;
}