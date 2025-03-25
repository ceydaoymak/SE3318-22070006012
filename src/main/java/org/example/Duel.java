package org.example;
/**
 * @requires s1 != null && s2 != null && spell != null
 * @effects Simulates duel and prints result
 */
public class Duel {
    public static void start(HogwartsStudent s1, HogwartsStudent s2, String spell) {
        boolean s1Knows = s1.knowsSpell(spell);
        boolean s2Knows = s2.knowsSpell(spell);

        if (!s1Knows && !s2Knows) {
            System.out.println(" None of the students knows the spell.");
        } else if (s1Knows && !s2Knows) {
            System.out.println(s1.getName() + "wins");
        } else if (!s1Knows && s2Knows) {
            System.out.println(s2.getName() + "wins");
        } else {
            if (Math.random() < 0.5) {
                System.out.println(s1.getName() + "wins");
            } else {
                System.out.println(s2.getName() + "wins");
            }
        }
    }
}
