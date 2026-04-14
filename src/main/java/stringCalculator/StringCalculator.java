package stringCalculator;

import javax.swing.text.html.Option;
import java.util.Optional;

public class StringCalculator {
    static void main() {
        StringCalculator sc1 = new StringCalculator();
        try {
            System.out.println(sc1.calculate("1", "2", "1001"));
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }

    // at runtime dealing with length of varargs - will be using for simplicity's sake
    public String calculate(String... strOfNumbers) {
        int sum = 0;
        if(strOfNumbers.length > 3) {
            throw new IllegalArgumentException("Incorrect arguments. Only 0-2 number of arguments are valid.");
        } else if (strOfNumbers.length == 0) {
            return "";
        }
        for (String arg : strOfNumbers) {
            if (!arg.matches("^\\d+$")) {
                throw new IllegalArgumentException("Argument [" + arg + "] is not a valid positive integer");
            } else if (Integer.parseInt(arg) > 1000) {
                throw new IllegalArgumentException("Argument [" + arg + "] out of valid range: 0 <= ARGS <= 1000");
            } else if (arg.isEmpty()) {
                continue;
            }
            int value = Integer.parseInt(arg);
            sum += Integer.parseInt(arg);
        }

        return Integer.toString(sum);
    }

//    // solving with optional objects... very messy in my opinion
//    public String calculateOptional(Optional<Integer> opt1, Optional<Integer> opt2 , Optional<Integer> opt3) {
//        return "";
//    }
//
//    // best practice - overloading method
//
//    public String calculateOverload(String int1) {
//        return "";
//    }
//    public String calculateOverload(String int1, String int2) {
//        return "";
//    }
//    public String calculateOverload(String int1, String int2, String int3) {
//        return "";
//    }


}
