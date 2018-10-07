package com.example.neera.databases.models;

/**
 * Created by Neera on 28/09/17.
 */

public class Todo {
    int id;
    String task;
    boolean done;

    public Todo(int id, String task, boolean done) {
        this.id = id;
        this.task = task;
        this.done = done;
    }

    public Todo(String task, boolean done) {
        this.task = task;
        this.done = done;
    }

    public Todo(String task) {
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public boolean isDone() {
        return done;
    }
}
