package org.example;

public class Warrior extends Hero {

    public Warrior(String name, int level) {
        super(name, level);
    }

    public void attack() {
        System.out.println(name + " swings their sword with great force!");
    }

    @Override
    public void speak() {
        System.out.println(name + ": Strength and honor!");
    }
}
