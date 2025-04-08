package org.example;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Arin", 5);
        Enemy enemy = new Enemy("Shadowbeast", 4);
        QuestBoard board = new QuestBoard();

        hero.speak();
        enemy.speak();

        board.assignQuest(hero, "Retrieve the ancient sword");

        BattleManager battle = new BattleManager();
        battle.battle(hero, enemy);
    }
}