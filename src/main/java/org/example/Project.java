package org.example;


import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<User> users;
    private List<Task> tasks;

    public Project() {
        this.users = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    // requires: user must not be null.
    // effects: Adds user to the project user list.
    public void addUser(User user) {
    }

    // requires: task must not be null.
    // effects: Adds task to the project task list.
    public void addTask(Task task) {
    }

    // requires: title must not be null or empty.
    // effects: Returns the task matching the title if found; otherwise returns null.
    public Task getTaskByTitle(String title) {
        return null;
    }
}
