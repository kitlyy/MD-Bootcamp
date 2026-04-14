package stringCalculator;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Nested
    class SimplePassCases {
        @Test
        void TestWithZeroArguments() {
            StringCalculator sc = new StringCalculator();
            String result = sc.calculate();
            assertEquals("", result);
        }
        @Test
        void TestWithOneValidArguments() {
            StringCalculator sc = new StringCalculator();
            String result = sc.calculate("1");
            assertEquals("1", result);
        }
        @Test
        void TestWithTwoValidArguments() {
            StringCalculator sc = new StringCalculator();
            String result = sc.calculate("1", "2");
            assertEquals("3", result);
        }
        @Test
        void TestWithThreeValidArguments() {
            StringCalculator sc = new StringCalculator();
            String result = sc.calculate("1", "2", "3");
            assertEquals("6", result);
        }
    }

    @Nested
    class IllegalArguments {
        @Test
        void ThreeArgumentsWithANegativeNumber() {
            StringCalculator sc = new StringCalculator();
            String expectedMessage = "Argument [-3] is not a valid positive integer";
            String actualMessage = "";

            try {
                String willNotHappen = sc.calculate("1", "2", "-3");
            } catch (IllegalArgumentException e) {
                actualMessage = e.getMessage();
            }
            assertTrue(actualMessage.contains(expectedMessage));
        }
        @Test
        void ThreeArgumentsWithEmptyStringArgument() {
            StringCalculator sc = new StringCalculator();
            String expectedMessage = "Argument [] is not a valid positive integer";
            String actualMessage = "";

            try {
                String willNotHappen = sc.calculate("1", "2", "");
            } catch (IllegalArgumentException e) {
                actualMessage = e.getMessage();
            }
            assertTrue(actualMessage.contains(expectedMessage));
        }
        @Test
        void ThreeArgumentsWithNonIntegerArgument() {
            StringCalculator sc = new StringCalculator();
            String expectedMessage = "Argument [asdf] is not a valid positive integer";
            String actualMessage = "";

            try {
                String willNotHappen = sc.calculate("1", "2", "asdf");
            } catch (IllegalArgumentException e) {
                actualMessage = e.getMessage();
            }
            assertTrue(actualMessage.contains(expectedMessage));
        }
        @Test
        void ArgumentIsGreaterThan1000() {
            StringCalculator sc = new StringCalculator();
            String expectedMessage = "Argument [1001] out of valid range: 0 <= ARGS <= 1000";
            String actualMessage = "";

            try {
                String willNotHappen = sc.calculate("1", "2", "1001");
            } catch (IllegalArgumentException e) {
                actualMessage = e.getMessage();
            }
            assertTrue(actualMessage.contains(expectedMessage));
        }
    }




}