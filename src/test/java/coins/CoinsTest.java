package coins;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinsTest {

    Coins coins = new Coins();

    @Test
    public void testValidDataSet1() {

        List<Integer> expected = List.of(20, 1);
        List<Integer> result = coins.getCoins(21);
        assertEquals(expected, result);
    }

    @Test
    public void testValidDataSet2() {
        List<Integer> expected = List.of(20, 5, 1);
        List<Integer> result = coins.getCoins(26);
        assertEquals(expected, result);
    }
}