package labHeroesGame;

import labHeroesGame.characters.Character;

class GameManager {

    void start() {
        Character c1 = new CharacterFactory().createCharacter();
        Character c2 = new CharacterFactory().createCharacter();

        fight(c1, c2);
    }

    void fight(Character c1, Character c2) {

    }
}
