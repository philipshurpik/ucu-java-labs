package hw1.labHeroesGame.characters;

public class Hobbit extends Character {
    public Hobbit() {
        this.setHp(3);
        this.setPower(0);
    }

    @Override
    public void kick(Character enemy) {
        this.toCry();
    }

    private void toCry() {
        System.out.println("Please don't kill me... Crying on the knees... '( ");
    }
}
