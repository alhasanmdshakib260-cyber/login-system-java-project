package com.example.loginsystem;
import javafx.event.ActionEvent;
import java.io.IOException;


public class HomeController {

    public void logout(ActionEvent actionEvent) throws IOException {
        HelloApplication.changeScene("login");

    }
}
