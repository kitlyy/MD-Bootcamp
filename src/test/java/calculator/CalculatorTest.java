package calculator;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Nested
    class DivideTests {
        @Test
        public void testDivideGivesCorrectResult() {
            //init calc object - ARRANGE
            Calculator testCalc = new Calculator();

            //ACT
            int result = testCalc.divide(10, 5);

            //ASSERT
            assertEquals(2, result);
        }

        @Test
        public void testDivideThrowsExceptionWhenDivideByZero() {
            //ARRANGE
            Calculator testCalc = new Calculator();
            //ACT + ASSERT
            /*
             in this test, our lambda function serves as an act which is also inside our assert
             JUnit method, the result of the lambda function is used as part of the assertion
             */
            assertThrows(IllegalArgumentException.class, () -> testCalc.divide(10, 0));
        }
    }

    @Nested
    class AddTests {
        @Test
        public void testShouldReturnCorrectPositiveSum() {
            //ARRANGE
            Calculator calc = new Calculator();
            int expected = 2;
            //ACT
            int result = calc.add(1, 1);
            //ASSERT
            assertEquals(expected, result);
        }

        @Test
        public void calculationForPositiveAndNegativeInteger() {
            //ARRANGE
            Calculator calc = new Calculator();
            int expected = 0;
            //ACT
            int result = calc.add(-1, 1);
            //ASSERT
            assertEquals(expected, result);
        }
    }
}