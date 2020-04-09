package com.planetdebug.bookingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController
{
    @FXML
    private TextField nameField;

    public void onButtonClicked()
    {
        System.out.println("Hello, " + this.nameField.getText());
    }
}
