package labHeroesGame.characters;

import java.util.Random;

public class King extends Character implements RandomKick {
    King() {
        Random random = new Random();
        this.setHp(random.nextInt(10) + 5);
        this.setPower(random.nextInt(10) + 5);
    }
}
