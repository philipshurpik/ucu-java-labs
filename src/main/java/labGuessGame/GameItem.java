package labGuessGame;

class GameItem {
    private int max;
    private int numberOfTries = 0;

    GameItem(int max) {
        this.max = max;
    }

    ResultType testResult(int number) {
        numberOfTries++;
        return number > max ? ResultType.MORE : (number < max ? ResultType.LESS : ResultType.EQUAL);
    }

    double getScore() {
        return max/numberOfTries;
    }
}
