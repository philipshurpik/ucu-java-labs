package labGuessGame;

import java.io.Serializable;

class GameItem implements Serializable {
    private int max;
    private int numberOfTries = 0;

    GameItem(int max) {
        this.max = max;
    }

    ResultType testResult(int number) {
        numberOfTries++;
        if (number == max) {
            return ResultType.EQUAL;
        }
        return number > max ? ResultType.BIGGER : ResultType.SMALLER;
    }

    double getScore() {
        return max/numberOfTries;
    }
}
