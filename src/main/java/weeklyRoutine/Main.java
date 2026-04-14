package weeklyRoutine;

import java.util.Map;

import static java.util.Map.entry;

public class Main {
    static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 2:
                System.out.println("On Tuesday I go to the gym");
                break;
            case 4:
                System.out.println("It's a Thursday i go to the gym");
                break;
            case 6:
                System.out.println("Saturday yay");
                break;
            case 7:
                System.out.println("On a Sunday I do gardening");
                break;
            default:
                System.out.println("It's a weekday");
                break;
        }

        // alternative solution using a hashmap
        Map<Integer, String> test2 = Map.ofEntries(
                entry(1, "It's a weekday"),
                entry(2, "On a Tuesday I go to the gym"),
                entry(3, "It's a weekday"),
                entry(4, "On a Thursday I go to the gym"),
                entry(5, "It's a weekday"),
                entry(6, "It's the weekend yay"),
                entry(7, "On Sunday I do gardening"));

        for(Integer key : test2.keySet()) {
            if (key == day) {
                System.out.println(test2.get(key));
            }
        }


    }
}
