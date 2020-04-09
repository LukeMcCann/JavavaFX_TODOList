package com.planetdebug.bookingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController
{
    // FXML ids are mapped to variables by the @FXML annotation.
    @FXML
    private TextField nameField;

    // It is best practice to annotate EventHandlers for other developers to easily derive which methods are handlers.
    @FXML
    public void onButtonClicked()
    {
        System.out.println("Hello, " + this.nameField.getText());
    }
}
