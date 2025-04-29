package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private Map<String, List<String>> notifications;

    public NotificationService() {
        this.notifications = new HashMap<>();
    }

    // requires: user and message must not be null or empty.
    // effects: Sends a text notification to the user and stores it in their notification list.
    public void sendNotification(User user, String message) {
    }

    // requires: user must not be null.
    // effects: Returns the list of notifications for the given user.
    public List<String> getNotifications(User user) {
        return new ArrayList<>();
    }
}
