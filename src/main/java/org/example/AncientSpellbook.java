package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AncientSpellbook {
    private List<String> spells;

    public AncientSpellbook() {
        spells = new ArrayList<>();
    }

    public void addSpell(String spell) {
        if (spell != null) spells.add(spell);
    }

    public String getSpell(int index) {
        return spells.get(index);
    }


    public List<String> getSpellsByPrefix(String prefix) {
        return spells.stream()
                .filter(spell -> spell.startsWith(prefix))
                .collect(Collectors.toList());
    }

}
