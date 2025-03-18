package org.example.middleearth;

public class Main {
    public static void main(String[] args) {
        Mentor gandalf = new Mentor("Gandalf", "The Grey");
        Mentor elrond = new Mentor("Elrond", "Lord of Rivendell");

        Adventurer frodo = new Adventurer("Frodo Baggins", "Ringbearer", "Hobbit");
        Adventurer aragorn = new Adventurer("Aragorn", "King of Gondor", "Man");
        Adventurer legolas = new Adventurer("Legolas", "Prince of Mirkwood", "Elf");
        Adventurer gimli = new Adventurer("Gimli", "Son of Gloin", "Dwarf");

        Quest quest1 = new Quest("Destroy the One Ring", 10, gandalf);
        Quest quest2 = new Quest("Defend Helm's Deep", 8, elrond);

        frodo.joinQuest(quest1);
        aragorn.joinQuest(quest2);
        legolas.joinQuest(quest2);
        gimli.joinQuest(quest2);

        System.out.println("Adventurers in 'Destroy the One Ring': " + quest1.getAdventurers());
        System.out.println("Adventurers in 'Defend Helm's Deep': " + quest2.getAdventurers());
    }
}
