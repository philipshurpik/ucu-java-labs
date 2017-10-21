package labHeroesGame.characters;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
public abstract class Character {
    private int power;
    private int hp;

    public void kick(Character c) {

    }

    boolean isAlive() {
        return this.hp > 0;
    }

    void decreaseHp(int number) {
        this.hp = decrease(this.hp, number);
    }

    void decreasePower(int number) {
        this.power = decrease(this.power, number);
    }

    private int decrease(int value, int number) {
        return (number > value) ? 0 : value - number;
    }
}
