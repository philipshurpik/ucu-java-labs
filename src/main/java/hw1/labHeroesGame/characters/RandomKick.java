package hw1.labHeroesGame.characters;

import java.util.Random;

public interface RandomKick {
    int getPower();

    default void kick(Character enemy) {
        Random random = new Random();
        int kickPower = random.nextInt(this.getPower()) + 1;
        enemy.decreaseHp(kickPower);
    }
}