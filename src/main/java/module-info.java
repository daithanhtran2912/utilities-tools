module com.thanhtd.utilities.utilities {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires maven.model;
    requires java.desktop;

    opens com.thanhtd.utilities.utilities to javafx.fxml;
    exports com.thanhtd.utilities.utilities;
    exports com.thanhtd.utilities.utilities.controller;
    opens com.thanhtd.utilities.utilities.controller to javafx.fxml;
}