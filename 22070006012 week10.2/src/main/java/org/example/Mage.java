package org.example;

public class Mage extends Character {

    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    // Deals high magical damage as a special attack
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 50);
    }

    /**
     * Casts a magical shield.
     * Reduces the next incoming damage significantly.
     */
    public void shield() {
        System.out.println(getName() + " casts a shield spell! Incoming damage will be reduced.");
    }
}
