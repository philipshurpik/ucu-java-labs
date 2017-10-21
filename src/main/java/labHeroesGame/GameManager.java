package labHeroesGame;

import labHeroesGame.characters.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class GameManager {
    private Random random = new Random();
    private ArrayList<String> surviveMessages = new ArrayList<>(Arrays.asList("is still alive", "survives"));

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

    private void fight(Character c1, Character c2) throws InterruptedException {
        String c1Name = c1.getClass().getSimpleName();
        String c2Name = c2.getClass().getSimpleName();
        c2Name = c1Name.equals(c2Name) ? c2Name + " Junior" : c2Name;
        System.out.printf("Welcome on the Ring!! %s vs %s\n", c1Name, c2Name);
        System.out.printf("%s has %d power and %d hp\n", c1Name, c1.getPower(), c1.getHp());
        System.out.printf("%s has %d power and %d hp\n", c2Name, c2.getPower(), c2.getHp());

        do {
            int index = random.nextInt(2);
            Character first = index == 1 ? c1 : c2;
            String firstName = index == 1 ? c1Name : c2Name;
            Character second = index == 0 ? c1 : c2;
            String secondName = index == 0 ? c1Name : c2Name;

            first.kick(second);
            if (second.isAlive()) {
                String text = surviveMessages.get(random.nextInt(surviveMessages.size()));
                System.out.printf("%s kicks %s, but %s %s and has %d hp and %d power\n", firstName, secondName, secondName, text, second.getHp(), second.getPower());
            }
            else {
                System.out.printf("%s hits %s and %s tragically dies... \n\n%s is Winner!", firstName, secondName, secondName, firstName);
            }

            Thread.sleep(1000);
            if (c1.getPower() == c2.getPower() && c1.getPower() == 0) {
                System.out.println("\nFriendship wins!");
                return;
            }
        }
        while (c1.isAlive() && c2.isAlive());
    }
}
