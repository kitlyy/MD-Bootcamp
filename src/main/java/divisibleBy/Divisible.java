package divisibleBy;

import java.util.stream.IntStream;

public class Divisible {
    static void main(String[] args) {

        //algorithm works but readability could be improved

        final int[] calc = {0};
        final int[] sum2 = {IntStream.range(1, 501).map(i -> {calc[0] += (i%3 == 0 || i%5 == 0) ? i:0;
            return calc[0];
        }).sum()};
        System.out.println(calc[0]);
    }
}
