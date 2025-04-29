package org.example;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private Task task;

    @BeforeEach
    void setUp() {
        user = new User("johndoe", "john@example.com");
        task = new Task("Submit report", LocalDate.now().plusDays(2));
    }

    @Test
    void testAddTask() {
        user.addTask(task);
        assertTrue(user.getAllTasks().contains(task));
    }

    @Test
    void testAddTask_Null() {
        assertThrows(IllegalArgumentException.class, () -> user.addTask(null));
    }

    @Test
    void testHasTask_Found() {
        user.addTask(task);
        assertTrue(user.hasTask("Submit report"));
    }

    @Test
    void testHasTask_NotFound() {
        assertFalse(user.hasTask("Nonexistent Task"));
    }

    @Test
    void testHasTask_NullTitle() {
        assertThrows(IllegalArgumentException.class, () -> user.hasTask(null));
    }

    @Test
    void testGetAllTasks() {
        user.addTask(task);
        assertEquals(1, user.getAllTasks().size());
    }
}
