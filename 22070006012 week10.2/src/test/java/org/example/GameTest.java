package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testAddCharacter() {
        Game game = new Game();
        Warrior warrior = new Warrior("Ares", 100, 15);

        game.addCharacter(warrior);

        // No assertion is made since there's no direct access to the character list.
        // This test ensures the method runs without error.
        // Optionally: a public method could return character count for validation.
    }

    @Test
    public void testStartGameRunsWithoutCrash() {
        Game game = new Game();
        Warrior warrior = new Warrior("Orion", 100, 30);
        Mage mage = new Mage("Lyra", 60, 25); // Low health to end game quickly

        game.addCharacter(warrior);
        game.addCharacter(mage);

        // This method only prints output.
        // The test passes if no exception is thrown during execution.
        game.startGame();
    }
}
