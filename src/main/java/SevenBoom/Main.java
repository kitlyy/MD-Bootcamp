package SevenBoom;

import java.util.Arrays;
import java.util.List;

public class Main {

    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 9);
        System.out.println(sevenBoom(list));
    }

    public static String sevenBoom(List<Integer> list) {
        for (Integer i : list) {
            while (i > 0) {
                if (i%10 == 7) {
                    return "BOOM!";
                }
                i = (int) Math.floor(i/10);
            }
        }
        return "";
    }
}

