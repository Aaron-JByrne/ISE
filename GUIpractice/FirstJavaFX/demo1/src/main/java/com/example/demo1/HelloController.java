package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button ButtonTest;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        ButtonTest.setText("yoooooo");
    }


}
