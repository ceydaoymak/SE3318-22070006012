package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {
    private TaskManagement taskManager;
    private NotificationService notificationService;
    private User user;
    private Task task;

    @BeforeEach
    void setUp() {
        notificationService = new NotificationService();
        taskManager = new TaskManagement(notificationService);
        user = new User("alexsmith", "alex@example.com");
        task = new Task("Complete module", LocalDate.now().plusDays(5));
    }

    @Test
    void testAssignTaskToUser() {
        taskManager.assignTaskToUser(task, user);
        assertTrue(user.getAllTasks().contains(task));
    }

    @Test
    void testAssignTaskToUser_NullTask() {
        assertThrows(IllegalArgumentException.class, () -> taskManager.assignTaskToUser(null, user));
    }

    @Test
    void testAssignTaskToUser_NullUser() {
        assertThrows(IllegalArgumentException.class, () -> taskManager.assignTaskToUser(task, null));
    }

    @Test
    void testRemoveTaskFromUser() {
        user.addTask(task);
        taskManager.removeTaskFromUser(task, user);
        assertFalse(user.getAllTasks().contains(task));
    }

    @Test
    void testRemoveTaskFromUser_NullTask() {
        assertThrows(IllegalArgumentException.class, () -> taskManager.removeTaskFromUser(null, user));
    }

    @Test
    void testListTasksForUser() {
        user.addTask(task);
        assertEquals(1, taskManager.listTasksForUser(user).size());
    }

    @Test
    void testListTasksForUser_NullUser() {
        assertThrows(IllegalArgumentException.class, () -> taskManager.listTasksForUser(null));
    }
}
