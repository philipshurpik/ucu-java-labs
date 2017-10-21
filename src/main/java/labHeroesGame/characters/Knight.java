package labHeroesGame.characters;

public class Knight extends Character implements RandomKick {
    public Knight() {
        this.setHp(getRandom(2, 12));
        this.setPower(getRandom(2, 12));
    }
}
