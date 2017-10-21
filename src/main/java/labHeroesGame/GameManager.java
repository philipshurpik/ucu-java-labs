package labHeroesGame;

import labHeroesGame.characters.Character;

import java.util.Random;

class GameManager {
    private Random random = new Random();

    void start() {
        try {
            Character c1 = new CharacterFactory().createCharacter();
            Character c2 = new CharacterFactory().createCharacter();

            fight(c1, c2);
        }
        catch (Exception e) {
            System.out.println("Game start error" + e);
        }
    }

    private void fight(Character c1, Character c2) {
        do {
            int index = random.nextInt(2);
            Character first = index == 1 ? c1 : c2;
            Character second = index == 0 ? c1 : c2;
            String firstName = first.getClass().getSimpleName();
            String secondName = second.getClass().getSimpleName();

            first.kick(second);
            if (second.isAlive()) {
                System.out.printf("%s kicks %s, but %s is still alive and has %d hp", firstName, secondName, secondName, second.getHp());
                second.kick(first);

                if (first.isAlive()) {
                    System.out.printf("%s kicks %s... %s survives and has %d hp", secondName, firstName, firstName, first.getHp());
                } else {
                    System.out.printf("%s kicks back and WIN!!!", secondName);
                }
            }
            else {
                System.out.printf("%s kicks %s and %s tragically dies... %s is Winner!", firstName, secondName, secondName, firstName);
            }
        }
        while (c1.isAlive() && c2.isAlive());
    }
}
