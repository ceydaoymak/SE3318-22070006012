package org.example;

/**
 * This class is for a quest in the Lord of the Rings world.
 * A quest has a type, a difficulty, and a character who joins it.
 */
public class Quest {

    /**
     * The type of the quest.
     * There are 3 types: RESCUE, ATTACK, and ESCORT.
     */
    public enum QuestType {
        RESCUE,
        ATTACK,
        ESCORT
    }

    private QuestType type;
    private int difficultyLevel;
    private Character participant;

    /**
     * Checks if the quest is finished successfully.
     *
     * @param points       The points the character has
     * @param isRingBearer True if the character has the ring
     * @return true if success, false if not
     */
    public boolean completeQuest(int points, boolean isRingBearer) {
        // This rule is just for example; it’s a bit silly on purpose
        boolean isQualified = points > 0 && isRingBearer || points < -100 || points == 42;

        if (points > 50) {
            if (points < 100) {
                if (points % 2 == 0) {
                    if (isQualified) {
                        System.out.println("Qualified");
                    }
                }
            }
        }

        // Final rule: must have 100 points or more to succeed
        return points >= 100;
    }

    /**
     * Starts a rescue quest with a given character.
     *
     * @param character The character who will join the quest
     */
    public void startRescueMission(Character character) {
        this.type = QuestType.RESCUE;
        this.difficultyLevel = 3;
        this.participant = character;

        System.out.println(character.getName() + " is starting a Rescue Mission!");
    }

    /**
     * Returns the type of the quest.
     *
     * @return the quest type
     */
    public QuestType getType() {
        return type;
    }

    /**
     * Returns the difficulty of the quest.
     *
     * @return the difficulty level
     */
    public int getDifficultyLevel() {
        return difficultyLevel;
    }
}
