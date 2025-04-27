package com.anthony.sudoku;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label label = new Label("Hello, JavaFX!");
        Scene scene = new Scene(label, 400, 200);

        stage.setTitle("HelloFX");
        stage.setScene(scene);
        stage.show();
    }
}
