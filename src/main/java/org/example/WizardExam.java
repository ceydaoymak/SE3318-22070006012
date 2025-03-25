package org.example;

import java.util.List;

public class WizardExam {
    private List<String> requiredSpells;

    public WizardExam(List<String> requiredSpells) {
        this.requiredSpells = requiredSpells;
    }
    /**
     * @requires student != null
     * @effects returns true if student knows all required spells
     */
    public boolean pass(HogwartsStudent student) {
        return requiredSpells.stream().allMatch(student::knowsSpell);
    }

    public void evaluate(HogwartsStudent student) {
        if (pass(student)) {
            System.out.println(student.getName() + "passed");
        } else {
            System.out.println(student.getName() + "failed");
        }
    }
}
