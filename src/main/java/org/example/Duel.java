package org.example;

import java.util.Random;
/**
 * @requires s1 != null && s2 != null && spell != null
 * @effects Simulates duel and prints result
 */
class Duel {
    public static void start(HogwartsStudent s1, HogwartsStudent s2, String spell) {
        if (s1 == null || s2 == null || spell == null) {
            throw new NullPointerException("Student or spell cannot be null");
        }

        System.out.println("Duel between " + s1.getName() + " and " + s2.getName() + " using " + spell);
        boolean s1Knows = s1.knowsSpell(spell);
        boolean s2Knows = s2.knowsSpell(spell);

        if (!s1Knows && !s2Knows) {
            System.out.println("Draw! Neither student knows the spell.");
        } else if (s1Knows && !s2Knows) {
            System.out.println(s1.getName() + " wins!");
        } else if (!s1Knows && s2Knows) {
            System.out.println(s2.getName() + " wins!");
        } else {
            int winner = new Random().nextInt(2);
            System.out.println((winner == 0 ? s1.getName() : s2.getName()) + " wins the duel by magic power!");
        }
    }
}