package com.planetdebug.todolist;

import com.planetdebug.todolist.model.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class MainController
{
    private List<TodoItem> todoItems;

    public void initialize()
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
    }
}
