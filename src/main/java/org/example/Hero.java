package org.example;


public class Hero extends Character implements Questable {

    public Hero(String name, int level) {
        super(name, level);
    }

    @Override
    public void speak() {
        System.out.println(name + ": ready to defend eldoria!");
    }

    @Override
    public void acceptQuest(String questName) {
        System.out.println(name + " has accepted the quest: " + questName);
    }
}
