package labHeroesGame.characters;

import java.util.Random;

public class Knight extends Character implements RandomKick {
    Knight() {
        Random random = new Random();
        this.setHp(random.nextInt(10) + 5);
        this.setPower(random.nextInt(10) + 5);
    }
}
