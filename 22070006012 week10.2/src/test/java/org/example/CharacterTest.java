package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterTest {

    @Test
    public void testGetName() {
        Character character = new Warrior("Darius", 100, 20);
        assertEquals("Darius", character.getName());

        Character unnamedCharacter = new Warrior(null, 100, 20);
        assertEquals("Unknown", unnamedCharacter.getName());
    }

    @Test
    public void testGetHealthAndTakeDamage() {
        Character character = new Warrior("Lucian", 100, 15);
        assertEquals(100, character.getHealth());

        character.takeDamage(30);
        assertEquals(70, character.getHealth());
    }

    @Test
    public void testIsDefeated() {
        Character character = new Warrior("Ezra", 10, 10);
        assertFalse(character.isDefeated());

        character.takeDamage(15);
        assertTrue(character.isDefeated());
    }

    @Test
    public void testDefend() {
        Character character = new Warrior("Selene", 100, 20);
        // No output validation; we only ensure the method runs without exception
        character.defend();
    }

    @Test
    public void testComplexMethodExample() {
        Character character = new Warrior("Kairos", 100, 10);
        // No output validation; we only ensure the method runs without exception
        character.complexMethodExample();
    }
}
