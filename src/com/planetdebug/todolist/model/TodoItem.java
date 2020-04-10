package com.planetdebug.todolist.model;

import java.time.LocalDate;

/**
 * Class representative of an item in the TODO list.
 */
public class TodoItem
{
    private String desc;
    private String details;
    private LocalDate deadline;

    /*
        Empty Constructor
     */
    public TodoItem() {}

    public TodoItem(String desc, String details, LocalDate deadline) {
        this.desc = desc;
        this.details = details;
        this.deadline = deadline;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public String getDetails()
    {
        return details;
    }

    public void setDetails(String details)
    {
        this.details = details;
    }

    public LocalDate getDeadline()
    {
        return deadline;
    }

    public void setDeadline(LocalDate deadline)
    {
        this.deadline = deadline;
    }
}
