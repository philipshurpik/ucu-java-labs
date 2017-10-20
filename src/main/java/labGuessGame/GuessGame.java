package labGuessGame;

import javax.swing.*;
import java.util.Random;

class GuessGame {

    private GameItem bestGame;
    private String gameFilePath = "bestGame.obj";

    GuessGame() {
        Object savedGame = FileUtilities.readObjectFromFile(gameFilePath);
        if (savedGame != null) {
            bestGame = (GameItem)savedGame;
        }
    }

    boolean play(int max) {
        Random random = new Random();
        int selectedNumber = random.nextInt(max);
        GameItem gameItem = new GameItem(selectedNumber);
        ResultType result;
        double score;
        do {
            String userInput = JOptionPane.showInputDialog("Max number: " + max +" Please enter your guess");
            if (userInput == null) {
                return false;
            }
            result = gameItem.testResult(Integer.parseInt(userInput));
            StringBuilder message = new StringBuilder();
            if (result == ResultType.EQUAL) {
                score = gameItem.getScore();
                if (bestGame == null || bestGame.getScore() < score) {
                    bestGame = gameItem;
                    FileUtilities.writeObjectToFile(gameItem, gameFilePath);
                }
                message.append("Well done! ").append(userInput).append(" is a correct number. Your score is ").append(score);
            }
            else {
                message.append("Your guess is ").append(result).append(" then searched. (Max number: ").append(max).append(")");
            }
            JOptionPane.showMessageDialog(null, message);
        }
        while (result != ResultType.EQUAL);
        return true;
    }

    void printBestScore() {
        String message = bestGame == null ? "No best score saved" : "Game best score is: " + bestGame.getScore();
        JOptionPane.showMessageDialog(null, message);
    }
}
