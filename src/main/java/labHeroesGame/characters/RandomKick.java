package labHeroesGame.characters;

import java.util.Random;

public interface RandomKick {
    Random random = new Random();

    int getPower();

    default void kick(Character enemy) {
        int kickPower = random.nextInt(this.getPower());
        enemy.decreaseHp(kickPower);
    }
}