# Eldoria Game

This is a Java Maven project developed for the SE3318 Software Construction course. It demonstrates object-oriented programming concepts such as inheritance, abstraction, interfaces, and class collaboration through a fantasy game simulation.

## Project Structure

- Character (abstract): Base class for all characters.
- Hero: Inherits from Character. Represents playable characters.
- Enemy: Inherits from Character. Represents enemies.
- Questable (interface): Enables characters to accept quests.
- QuestBoard: Assigns quests to questable characters.
- BattleManager: Simulates a battle between a hero and an enemy.
- Mage and Warrior: Hero subclasses with unique abilities.

## Technologies Used

- Java 17
- Maven
- IntelliJ IDEA
- Git and SourceTree

## Sample Output

Arin: Ready to defend Eldoria!
Shadowbeast: Eldoria will fall!
Arin has accepted the quest: Retrieve the ancient sword
Battle starts: Arin vs Shadowbeast
Arin wins!