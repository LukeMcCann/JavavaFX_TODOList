package com.planetdebug.todolist.model;

import javafx.collections.FXCollections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
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

    public void loadTodoItems() throws IOException
    {
        todoItems = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);
        String input;

        try
        {
            while((input = br.readLine()) != null)
            {
                String[] itemPieces = input.split("\t");
                String desc = itemPieces[0];
                String details = itemPieces[1];
                String dateString = itemPieces[2];

                CharSequence text;
                LocalDate date = LocalDate.parse(dateString, dtf);

                TodoItem todoItem = new TodoItem(desc, details, date);

                todoItems.add(todoItem);
            }
        } finally {
            if(br != null)
            {
                br.close();
            }
        }
    }

    public void saveTodoItems() throws IOException
    {
        Path path = Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);

        try
        {
            Iterator<TodoItem> iter = todoItems.iterator();
            while(iter.hasNext())
            {
                TodoItem item = iter.next();
                bw.write(String.format(
                        "%s\t%s\t%s",
                        item.getDesc(),
                        item.getDetails(),
                        item.getDeadline().format(dtf)
                ));
                bw.newLine();
            }
        } finally {
            if(bw != null)
            {
                bw.close();
            }
        }

    }
}
