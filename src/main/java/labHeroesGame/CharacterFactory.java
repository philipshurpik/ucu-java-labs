package labHeroesGame;

import labHeroesGame.characters.*;
import labHeroesGame.characters.Character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    private List<Class<? extends Character>> characterClasses = new ArrayList<>();

    CharacterFactory() {
        characterClasses.add(Elf.class);
        characterClasses.add(Hobbit.class);
        characterClasses.add(King.class);
        characterClasses.add(Knight.class);
    }

    Character createCharacter() throws IllegalAccessException, InstantiationException {
        Random random = new Random();
        Class CharacterClass = characterClasses.get(random.nextInt(characterClasses.size()));
        return (Character)CharacterClass.newInstance();
    }
}
