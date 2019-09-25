package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int scorePosition;

        scorePosition = calculateScorePosition(1500);
        displayHighScorePosition("Jinook", scorePosition);

        scorePosition = calculateScorePosition(999);
        displayHighScorePosition("Laura", scorePosition);

        scorePosition = calculateScorePosition(499);
        displayHighScorePosition("Young", scorePosition);

        scorePosition = calculateScorePosition(99);
        displayHighScorePosition("Ken", scorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateScorePosition(int highScore) {
        if (highScore >= 1000) {
            return 1;
        } else if (highScore >= 500) {
            return 2;
        } else if (highScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
