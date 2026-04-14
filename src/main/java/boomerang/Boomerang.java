package boomerang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boomerang {
    static void main(String[] args) {
        Boomerang b1 = new Boomerang();
        List<int[]> results = b1.findBoomerang(new int[] {1, 7, 1, 7, 1, 7, 1});
        for (int[] item : results) {
            System.out.println(Arrays.toString(item));
        }
    }

    public List<int[]> findBoomerang (int[] list) {
        List<int[]> results = new ArrayList<>();
        for (int i = 0; i < list.length - 2; i++) {
            if(list[i] == list[i+2] && list[i] != list[i+1]) {
                results.add(new int[] { list[i], list[i + 1], list[i + 2] });
            }
        } return results;
    }
}
