package org.example;


import java.util.List;

public class TaskManagement {
    private NotificationService notificationService;

    public TaskManagement(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // requires: task and user must not be null.
    // effects: Assigns the task to the user by adding it to their task list and triggers notification service.
    public void assignTaskToUser(Task task, User user) {
    }

    // requires: task and user must not be null, and the user must have the task.
    // effects: Removes the task from the user's task list.
    public void removeTaskFromUser(Task task, User user) {
    }

    // requires: user must not be null.
    // effects: Returns all tasks currently assigned to the user.
    public List<Task> listTasksForUser(User user) {
        return null;
    }
}
