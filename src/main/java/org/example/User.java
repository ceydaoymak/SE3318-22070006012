package org.example;


import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Task> tasks;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    // requires: task must not be null.
    // effects: Adds task to the user's task list.
    public void addTask(Task task) {
    }

    // requires: title must not be null or empty.
    // effects: Returns true if the user has a task with the given title, else false.
    public boolean hasTask(String title) {
        return false;
    }

    // requires: None.
    // effects: Returns a list of all tasks assigned to the user.
    public List<Task> getAllTasks() {
        return new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }
}
