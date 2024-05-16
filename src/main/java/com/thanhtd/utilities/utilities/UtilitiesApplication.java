package com.thanhtd.utilities.utilities;

import com.thanhtd.utilities.utilities.config.PomFileReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import static com.thanhtd.utilities.utilities.constant.ViewConstant.MAIN_VIEW;

public class UtilitiesApplication extends Application {

    private static final int DEFAULT_WIDTH = 1366;
    private static final int DEFAULT_HEIGHT = 768;
    private static final String TITLE = "Utilities";

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UtilitiesApplication.class.getResource(MAIN_VIEW));
        Scene scene = new Scene(fxmlLoader.load(), DEFAULT_WIDTH, DEFAULT_HEIGHT);
        var model = PomFileReader.getModel();
        stage.setTitle(model == null ? TITLE : model.getName());
        stage.setScene(scene);
        stage.getIcons()
                .add(new Image(Objects.requireNonNull(UtilitiesApplication
                        .class
                        .getResourceAsStream("images/tool-box-icon.png"))));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}