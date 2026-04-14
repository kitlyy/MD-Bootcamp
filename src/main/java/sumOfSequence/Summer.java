package sumOfSequence;

import java.util.ArrayList;
import java.util.List;

public class Summer {
    static void main() {
        Summer summer = new Summer();
        System.out.println(summer.getResult(1, 4, 1));
        System.out.println(summer.getResult(2, 6, 2));
    }

    public int getResult(int start, int end, int step){
        int sum = 0;
        List<Integer> sumList = new ArrayList<Integer>();
        for (int i = start; i < end + 1; i ++) {
            sumList.add(i);
        }
        for (int i = 0; i < sumList.size(); i += step) {
            sum += sumList.get(i);
        }
        return sum;
    }
}
