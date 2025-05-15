package org.example;

public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return (name != null) ? name : "Unknown";
    }

    // Returns current health value
    public int getHealth() {
        return health;
    }

    // Applies damage to the character
    public void takeDamage(int damage) {
        health -= damage;
    }

    // Each character must implement a special attack
    public abstract void specialAttack(Character opponent);

    // Returns true if character is defeated
    public boolean isDefeated() {
        return health <= 0;
    }

    /**
     * Basic defense mechanism.
     * Can be overridden for custom defense behavior.
     */
    public void defend() {
        System.out.println(getName() + " defends and slightly reduces the damage.");
    }

    /**
     * Demonstrates a multi-hit attack using a loop.
     * Calculates total damage and prints the result.
     */
    public void complexMethodExample() {
        int damage = 0;
        int i = 1;
        while (i <= 3) {
            damage += attackPower * i;
            i++;
        }
        System.out.println(getName() + " unleashes a complex attack dealing " + damage + " damage!");
    }
}
