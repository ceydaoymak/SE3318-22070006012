package org.example;

/**
 * This class is for a character from Lord of the Rings.
 * The character has a name, race, age, and weapon.
 */
public class Character {

    private String name;
    private String race;
    private int age;
    private String weapon;

    /**
     * This is the constructor.
     * It creates a new character with name, race, age, and weapon.
     *
     * @param name   The name of the character
     * @param race   The race of the character (like Hobbit or Elf)
     * @param age    The age of the character
     * @param weapon The weapon the character has
     */
    public Character(String name, String race, int age, String weapon) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.weapon = weapon;
    }

    /**
     * This method shows information about the character.
     * It also prints extra info if the character is a Hobbit,
     * is 50 or older, or if the name is Frodo.
     */
    public void printDetails() {
        if (race.equals("Hobbit")) {
            System.out.println("Character is a Hobbit");
        }

        if (age >= 50) {
            System.out.println("Character is 50 or older");
        } else if (name.equals("Frodo")) {
            System.out.println("Character is Frodo");
        }

        System.out.println("Weapon: " + weapon);
    }

    /**
     * Gets the name of the character.
     *
     * @return the character's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the weapon of the character.
     *
     * @return the character's weapon
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * Sets a new weapon for the character.
     *
     * @param weapon the new weapon
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
