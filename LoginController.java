package com.example.loginsystem;

import javafx.event.ActionEvent;

import java.io.IOException;

public class LoginController {
    public void login(ActionEvent actionEvent) throws IOException {
        HelloApplication.changeScene("home");
    }
}