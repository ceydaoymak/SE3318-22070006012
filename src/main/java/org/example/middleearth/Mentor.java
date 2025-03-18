package org.example.middleearth;
import java.util.ArrayList;
import java.util.List;

public class Mentor extends Character {
    private List<Quest> quests;

    public Mentor(String name, String title) {
        super(name, title);
        this.quests = new ArrayList<>();
    }

    public void assignQuest(Quest quest) {
        quests.add(quest);
    }

    @Override
    public String toString() {
        return name + " the " + title;
    }
}