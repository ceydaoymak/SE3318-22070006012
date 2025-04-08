package org.example;
public class BattleManager {
    public void battle(Hero hero, Enemy enemy) {
        System.out.println("Battle starts:" + hero.name + " vs " + enemy.name);
        if (hero.level >= enemy.level) {
            System.out.println(hero.name + " wins");
        } else {
            System.out.println(enemy.name + " wins");
        }
    }
}