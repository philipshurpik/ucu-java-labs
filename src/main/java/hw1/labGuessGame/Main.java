package hw1.labGuessGame;

public class Main {

    public static void main(String[] args) {
        int maxNumber = 50;
        GuessGame guessGame = new GuessGame();

        boolean continueGame = true;
        while (continueGame) {
            continueGame = guessGame.play(maxNumber);
            guessGame.printBestScore();
        }
    }
}
