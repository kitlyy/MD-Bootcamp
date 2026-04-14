package parkingCharges;

import java.util.*;
import static java.util.Map.entry;
import java.lang.classfile.Signature;

public class Parking {
    static void main(String[] args) {
        int hour = 10;
        int duration = 6;
        int curCostBoundary = getCostBoundary(hour);
        int cost = 0;

        for (int i = hour; i < hour + duration; i++) {
            int tempCostBoundary = getCostBoundary(i);
            if (curCostBoundary != tempCostBoundary) {
                curCostBoundary = tempCostBoundary;
            }
            cost += curCostBoundary;
        }
        System.out.println("final cost is " + cost);

        // try with floor key of tree map

    }

    public static int getCostBoundary(int hour) {
        if (hour >= 0 && hour < 5) {
            return 300;
        } else if (hour >= 5 && hour < 10) {
            return 350;
        } else if (hour >= 10 && hour < 15) {
            return 500;
        } else if (hour >= 15 && hour < 20) {
            return 700;
        } else if (hour >= 20) {
            return 400;
        }
        return 0;
    }
}
