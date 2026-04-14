package RockPaperScissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        //System.out.println("rock");

        List<String> hand = Arrays.asList("Rock", "Paper", "Scissors");

        String userThrow = "Rock";
        int randomNum = (int)(Math.random() * 3);
        String compThrow = hand.get(randomNum);
        System.out.println(compThrow);
        System.out.println(getWinner(userThrow, compThrow));
    }



    public static String getWinner(String userThrow, String compThrow) {
        switch (userThrow) {
            case "Rock":
                if (compThrow.equals("Scissors")) {
                    return "user won";
                } else if (compThrow.equals("Paper")) {
                    return "comp won";
                } else return "draw";
            case "Paper":
                if (compThrow.equals("Rock")) {
                    return "user won";
                } else if (compThrow.equals("Scissors")) {
                    return "comp won";
                } else return "draw";
            case "Scissors":
                if (compThrow.equals("Paper")) {
                    return "user won";
                } else if (compThrow.equals("Rock")) {
                    return "comp won";
                } else return "draw";
        }
        return "";
    }
}
