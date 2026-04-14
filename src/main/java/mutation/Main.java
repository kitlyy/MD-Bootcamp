package mutation;

import java.util.Arrays;

public class Main {
    static void main() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] copiedNumbers = Arrays.copyOf(numbers, numbers.length);
        //this line of code is not a deep copy, it passes a reference to the array
        //both variables point to the same memory location
        //use array copy method
        int [] copiedNumbers2 = numbers.clone();
//        System.out.println("Copied numbers: ");
//        for (int n : copiedNumbers) {
//            System.out.println(n);
//        }

//        System.out.println("Copied numbers: " + Arrays.toString(copiedNumbers));

        copiedNumbers[copiedNumbers.length - 1] = 10;
        copiedNumbers2[copiedNumbers2.length - 1] = 100;

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Copied Numbers: " + Arrays.toString(copiedNumbers));
        System.out.println("Copied Numbers Set 2: " + Arrays.toString(copiedNumbers2));
    }
}
