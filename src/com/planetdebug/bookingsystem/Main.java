package com.planetdebug.bookingsystem;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);

        Label lbl = new Label("Welcome to JavaFX!");
        lbl.setTextFill(Color.GREEN);
        lbl.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
        root.getChildren().add(lbl);

        primaryStage.setTitle("JavaFX_Sandbox");
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
    }
}
