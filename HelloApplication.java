package com.example.loginsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        HelloApplication.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Scene Shifting!");
        stage.setScene(scene);
        stage.show();
    }

    public static void changeScene(String fxmlFile) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFile + ".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        //primary stage
        HelloApplication.stage.setScene(scene);
        //Secondary stage
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
    }
}

