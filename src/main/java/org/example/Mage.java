package org.example;


public class Mage extends Hero {

    public Mage(String name, int level) {
        super(name, level);
    }

    public void castSpell() {
        System.out.println(name + " casts a powerful fireball!");
    }

    @Override
    public void speak() {
        System.out.println(name + ": The arcane flows through me!");
    }
}
