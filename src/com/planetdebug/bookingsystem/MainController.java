package com.planetdebug.bookingsystem;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
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
    private Label label1;

    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        goodbyeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e)
    {
        if(e.getSource().equals(helloButton))
        {
            say("Hello, " + this.nameField.getText());
        }
        else if(e.getSource().equals(goodbyeButton))
        {
            say("Goodbye, " + this.nameField.getText());
        }

        // Working with nodes on the scene graph must be performed on th JavaFX scene thread
        // this is to stop thread X overwriting thread Y.

        Runnable task = new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(10000);

                    // Forces thread to run on UI thread.
                    Platform.runLater(new Runnable()
                    {
                        @Override
                        public void run()
                        {
                            label1.setText("We did something!");
                        }
                    });
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        };

        new Thread(task).start();

        if(this.checkBox.isSelected())
        {
            nameField.clear();
            helloButton.setDisable(true);
            goodbyeButton.setDisable(true);
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
    public void handleChange()
    {
        System.out.println("CheckBox Status: " + (this.checkBox.isSelected() ? "checked" : "unchecked"));
    }

    @FXML
    public void handleKeyReleased() {
        helloButton.setDisable(textFieldIsEmpty());
        goodbyeButton.setDisable(textFieldIsEmpty());
    }
}
