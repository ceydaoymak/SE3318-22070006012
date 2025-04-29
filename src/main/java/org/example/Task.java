package org.example;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dueDate;
    private boolean isCompleted;

    public Task(String title, LocalDate dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    // requires: dueDate must not be null.
    // effects: Returns true if the current date is after dueDate, else returns false.
    public boolean isOverdue() {
        return false;
    }

    // requires: Task must not already be completed.
    // effects: Sets task's completion status to true.
    public void markAsCompleted() {
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
