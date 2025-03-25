package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 5);
        HogwartsStudent luna = new HogwartsStudent("Luna", "Ravenclaw", 4);

        System.out.println(harry.learnSpell("Expelliarmus"));
        System.out.println(harry.learnSpell("Expelliarmus"));

        AncientSpellbook book = new AncientSpellbook();
        book.addSpell("Expelliarmus");
        book.addSpell("Expecto Patronum");
        book.addSpell("Expulso");

        System.out.println(book.getSpellsByPrefix("Exp"));

        MagicClassroom room = new MagicClassroom();
        room.addStudent(harry);
        room.addStudent(draco);
        room.addStudent(luna);

        WizardExam exam = new WizardExam(List.of("Expelliarmus", "Expulso"));
        exam.evaluate(harry);

    }
}
