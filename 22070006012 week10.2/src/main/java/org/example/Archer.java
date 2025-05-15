package org.example;

public class Archer extends Character {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 20);
    }

    /**
     * Attempts to dodge the incoming attack.
     * Simulates a swift and agile evasion maneuver.
     */

// ADDED: New Feature - evade
    public void evade() {
        System.out.println(getName() + " attempts to EVADE the attack swiftly!");
    }

}