package com.example.demo1;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Line;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Line line = new Line();

        line.setStartX(100);
        line.setStartY(150);
        line.setEndX(500);
        line.setEndY(150);

        Group root = new Group(line);


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 600, 300);
        Scene scene = new Scene(root, 600,300);
        stage.setTitle("test");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
