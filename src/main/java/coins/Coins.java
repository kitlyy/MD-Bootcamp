package coins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coins {
    static void main(String[] args) {
        try {
            Coins newCoins = new Coins();
            System.out.println(newCoins.getCoins(26));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Integer> getCoins(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        } else {
            int[] coins = {20, 10, 5, 2, 1};
            List<Integer> result = new ArrayList<>();
            for (int coin : coins) {
                if (amount / coin >= 1) {
                    result.addAll(Collections.nCopies(amount / coin, coin));
                    amount -= coin * (amount / coin);
                }
            } return result;
        }
    }
}
