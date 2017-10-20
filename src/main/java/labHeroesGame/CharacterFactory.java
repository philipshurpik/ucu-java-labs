package labHeroesGame;

import labHeroesGame.characters.*;
import labHeroesGame.characters.Character;

public class CharacterFactory {

    Character createCharacter() {
        return new Elf();
    }
}
