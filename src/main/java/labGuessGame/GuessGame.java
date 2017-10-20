package labGuessGame;

import javax.swing.*;
import java.util.Random;

class GuessGame {

    void play(int max) {
        Random random = new Random();
        int selectedNumber = random.nextInt(max);
        GameItem gameItem = new GameItem(selectedNumber);
        ResultType result;
        do {
            int userInput = Integer.parseInt(JOptionPane.showInputDialog("Max number: " + max +" Please enter your guess"));
            result = gameItem.testResult(userInput);
            if (result != ResultType.EQUAL) {
                StringBuilder message = new StringBuilder();
                message.append("Your result is ").append(result).append(" then searched. (Max number: ").append(max).append(")");
                JOptionPane.showMessageDialog(null, message.toString());
            }
        }
        while (result != ResultType.EQUAL);
        JOptionPane.showMessageDialog(null, "Well done! Your score is " + gameItem.getScore());
    }

    private void printBestScore() {

    }
}
