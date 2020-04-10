package com.planetdebug.bookingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class MainController
{
    // FXML ids are mapped to variables by the @FXML annotation.
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button goodbyeButton;
    @FXML
    private CheckBox checkBox;

    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        goodbyeButton.setDisable(true);
    }

    // It is best practice to annotate EventHandlers for other developers to easily derive which methods are handlers.
    // Using an ActionEvent means we don't need a separate handler for each control, by using e.getSource() we can tell
    // which component has been interacted with.
    @FXML
    public void onButtonClicked(ActionEvent e)
    {
//        System.out.println("Hello, " + this.nameField.getText());
//        System.out.println("The following button was pressed: " + e.getSource());
        if(e.getSource().equals(helloButton))
        {
            say("Hello, " + this.nameField.getText());
            if(this.checkBox.isSelected()) { nameField.clear(); }
        }
        else if(e.getSource().equals(goodbyeButton))
        {
            say("Goodbye, " + this.nameField.getText());
            if(this.checkBox.isSelected()) { nameField.clear(); }
        }
    }

    private boolean textFieldIsEmpty()
    {
        return(nameField.getText().trim().isEmpty());
    }

    private void say(String msg)
    {
        System.out.println(msg);
    }

    @FXML
    public void handleKeyReleased() {
        helloButton.setDisable(textFieldIsEmpty());
        goodbyeButton.setDisable(textFieldIsEmpty());
    }
}
