package FootballScore;

import java.util.Arrays;
import java.util.List;

public class FootballScore {

    static void main(String[] args) {
        FootballScore seasonOne = new FootballScore();
        System.out.println("season points: " + seasonOne.seasonPoints(1));
    }
    public int seasonPoints(int numMatches) {

        int[][] seasonScores = generateData(numMatches);

        int points = 0;
        for (int[] seasonScore : seasonScores) {
            int x = seasonScore[0];
            int y = seasonScore[1];
            if (x > y) {
                points += 3;
            } else if (x == y) {
                points += 1;
            }
        } return points;
    }

    private int[][] generateData(int numOfMatches) {
        int[][] games = new int[numOfMatches][2];
        for (int i = 0; i < numOfMatches; i++) {
            int homeScore = (int) (Math.random() * 4);
            int awayScore = (int) (Math.random() * 4);
            int[] matchScore = {homeScore, awayScore};
            games[i] = matchScore;
        }
        FootballScore seasonOne = new FootballScore();
        return games;
    }

}