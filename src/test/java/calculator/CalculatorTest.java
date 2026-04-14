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

            // ACT
            // divide(10, 5) = 2
            int result = testCalc.divide(10, 5);

            //ASSERT
            assertEquals(2, result);
        }

        @Test
        public void testDivideThrowsExceptionWhenDivideByZero() {
            Calculator testCalc = new Calculator();
            //divide(10,0) throws exception
            assertThrows(IllegalArgumentException.class, () -> testCalc.divide(10, 0));
            //assertThrows(IllegalArgumentException.class,  Calculator.divide(10,0));
            //this does not evaluate the expected result as a class, we are providing an int
            //here we provide a lambda function, a function without a name
        }

        @Test
        public void thisIsASimpleTest() {
            //logic for your simple test
        }
    }

    @Nested
    class AddTests {
        @Test
        public void testShouldReturnCorrectPositiveSum() {

        }
    }
}