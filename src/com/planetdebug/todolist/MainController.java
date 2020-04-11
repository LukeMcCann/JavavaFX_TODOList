package com.planetdebug.todolist;

import com.planetdebug.todolist.model.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class MainController
{
    private List<TodoItem> todoItems;

    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;

    public void initialize()
    {
        addDummyData();
    }

    private void addDummyData()
    {
        TodoItem item1 = new TodoItem("Attain a Developer job", "Attain employment as a developer",
                LocalDate.of(2020, Month.APRIL, 13));

        TodoItem item2 = new TodoItem("Advanced Software Development", "Build a RoomBooking application",
                LocalDate.of(2020, Month.MAY, 1));

        TodoItem item3 = new TodoItem("ASD Neural Network", "ANN and Fuzzy ANN comparison",
                LocalDate.of(2020, Month.MAY, 6));

        TodoItem item4 = new TodoItem("Advanced Software Development", "Build a RoomBooking application",
                LocalDate.of(2020, Month.MAY, 1));

        TodoItem item5 = new TodoItem("Exit Lockdown", "Build a RoomBooking application",
                LocalDate.of(2021, Month.MARCH, 14));

        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    public void handleClickListView()
    {
        TodoItem item = getSelectedItem();
        itemDetailsTextArea.setText(getCompleteDescriptionString(item));
    }

    private String getCompleteDescriptionString(TodoItem item)
    {
        return (item.getDetails() + "\n\n\n" +
                "Due: " +
                item.getDeadline().toString());
    }

    private TodoItem getSelectedItem()
    {
        return todoListView.getSelectionModel().getSelectedItem();
    }
}
