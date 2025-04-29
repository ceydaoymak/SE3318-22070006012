package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    private Task task;

    @BeforeEach
    void setUp() {
        task = new Task("Finish homework", LocalDate.now().plusDays(1));
    }

    @Test
    void testIsOverdue_False() {
        assertFalse(task.isOverdue());
    }

    @Test
    void testIsOverdue_True() {
        Task overdueTask = new Task("Past Task", LocalDate.now().minusDays(1));
        assertTrue(overdueTask.isOverdue());
    }

    @Test
    void testMarkAsCompleted() {
        task.markAsCompleted();
        assertTrue(task.isCompleted());
    }

    @Test
    void testMarkAsCompleted_AlreadyCompleted() {
        task.markAsCompleted();
        assertThrows(IllegalStateException.class, task::markAsCompleted);
    }
}

