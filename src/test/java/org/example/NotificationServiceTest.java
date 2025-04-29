package org.example;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {
    private NotificationService notificationService;
    private User user;

    @BeforeEach
    void setUp() {
        notificationService = new NotificationService();
        user = new User("janedoe", "jane@example.com");
    }

    @Test
    void testSendNotification() {
        notificationService.sendNotification(user, "New assignment!");
        assertEquals(1, notificationService.getNotifications(user).size());
    }

    @Test
    void testSendNotification_NullUser() {
        assertThrows(IllegalArgumentException.class, () -> notificationService.sendNotification(null, "Hello"));
    }

    @Test
    void testSendNotification_EmptyMessage() {
        assertThrows(IllegalArgumentException.class, () -> notificationService.sendNotification(user, ""));
    }

    @Test
    void testGetNotifications_NoNotifications() {
        assertTrue(notificationService.getNotifications(user).isEmpty());
    }
}
