package hw1.labHeroesGame.characters;

public class Elf extends Character {
    public Elf() {
        this.setHp(10);
        this.setPower(10);
    }

    @Override
    public void kick(Character enemy) {
        int enemyPower = enemy.getPower();
        if (enemyPower < this.getPower()) {
            enemy.decreaseHp(enemy.getHp());
        }
        else {
            enemy.decreasePower(1);
        }
    }
}
