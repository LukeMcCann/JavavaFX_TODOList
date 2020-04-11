package com.planetdebug.todolist.model;

import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Singleton
 */
public class TodoData
{
    private static TodoData instance = new TodoData();
    private static String filename = "TodoListItems.txt";
    private List<TodoItem> todoItems;
    private DateTimeFormatter dtf;

    private TodoData()
    {
        this.dtf = DateTimeFormatter.ofPattern("MMMM d, YYYY"); // dd-MM-yyyy
    }

    public static TodoData getInstance()
    {
        return instance;
    }

    public List<TodoItem> getTodoItems()
    {
        return todoItems;
    }

    public void setTodoItems(List<TodoItem> todoItems)
    {
        this.todoItems = todoItems;
    }
}
