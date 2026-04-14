package sumOfSequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummerTest {

    Summer summer = new Summer();


    @Test
    public void testDataSet1() {
        int result = summer.getResult(1, 4, 1);
        assertEquals(10, result);
    }

    @Test
    public void testDataSet2() {
        int result = summer.getResult(2, 6, 2);
        assertEquals(12, result);
    }
}