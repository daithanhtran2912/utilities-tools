package com.thanhtd.utilities.utilities.controller;

import com.thanhtd.utilities.utilities.config.PomFileReader;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label versionLabel;

    @FXML
    private Label appNameLabel;

    public void initialize() {
        var model = PomFileReader.getModel();
        this.versionLabel.setText("Created by os-thanhtd | Version-" +
                (model == null
                        ? "Unknown"
                        : model.getVersion()));
        this.appNameLabel.setText(model == null ? "Utilities" : model.getName());
    }
}