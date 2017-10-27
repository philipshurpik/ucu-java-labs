package hw1.labHeroesGame.characters;

public class King extends Character implements RandomKick {
    public King() {
        this.setHp(getRandom(5, 15));
        this.setPower(getRandom(5, 15));
    }

    @Override
    public void kick(Character enemy) {
        RandomKick.super.kick(enemy);
    }
}
