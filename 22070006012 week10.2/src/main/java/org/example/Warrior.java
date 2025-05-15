package org.example;

public class Warrior extends Character {

    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    // Executes a strong melee attack
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower * 2);
    }

    /**
     * Increases the warrior's attack power.
     * Can be used to deal more damage in future turns.
     */
    public void stronger() {
        attackPower += 10;
        System.out.println(getName() + " used BOOST! Attack power increased to " + attackPower);
    }
}
