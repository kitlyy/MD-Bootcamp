package fizzbuzz;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Nested
    class SingleFizz {
        @Test
        void testReturnsTrueFor3() {
            //ARRANGE
            FizzBuzz fb = new FizzBuzz();
            String expected = "Fizz ";
            //ACT
            String result = fb.getFizzBuzz(3, 3);
            //ASSERT
            assertEquals(expected, result);
        }

        @Test
        void testReturnsTrueFor6() {
            FizzBuzz fb = new FizzBuzz();
            String expected = "Fizz ";

            String result = fb.getFizzBuzz(6, 6);

            assertEquals(expected, result);
        }

        @Test
        void testReturnsTrueFor1959() {
            //ARRANGE
            FizzBuzz fb = new FizzBuzz();
            String expected = "Fizz ";
            //ACT
            String result = fb.getFizzBuzz(1959, 1959);
            //ASSERT
            assertEquals(expected, result);
        }
    }
    @Nested
    class SingleBuzz {
        @Test
        void testReturnsTrueFor5() {
            //ARRANGE
            FizzBuzz fb = new FizzBuzz();
            String expected = "Buzz ";
            //ACT
            String result = fb.getFizzBuzz(5,5);
            //ACT
            assertEquals(expected, result);
        }
        @Test
        void testReturnsTrueFor10() {
            //ARRANGE
            FizzBuzz fb = new FizzBuzz();
            String expected = "Buzz ";
            //ACT
            String result = fb.getFizzBuzz(10,10);
            //ASSERT
            assertEquals(expected, result);
        }
        @Test
        void testReturnsTrueFor125() {
            //ARRANGE
            FizzBuzz fb = new FizzBuzz();
            String expected = "Buzz ";
            //ACT
            String result = fb.getFizzBuzz(125,125);
            //ASSERT
            assertEquals(expected, result);
        }
    }
    @Nested
    class SingleFizzBuzz {
        @Test
        void testReturnsTrueFor15() {
            //ARRANGE
            FizzBuzz fb = new FizzBuzz();
            String expected = "FizzBuzz ";
            String result = fb.getFizzBuzz(15,15);
            assertEquals(expected, result);
        }
        @Test
        void testReturnsTrueFor30() {
            //ARRANGE
            FizzBuzz fb = new FizzBuzz();
            String expected = "FizzBuzz ";
            //ACT
            String result = fb.getFizzBuzz(30,30);
            //ASSERT
            assertEquals(expected, result);
        }
        @Test
        void testReturnsTrueWith12345() {
            //ARRANGE
            FizzBuzz fb = new FizzBuzz();
            String expected = "FizzBuzz ";
            //ACT
            String result = fb.getFizzBuzz(12345,12345);
            //ASSERT
            assertEquals(expected, result);
        }
    }
    @Nested
    class RangeOfNumbers {
        @Test
        void testReturnsTrueFor15() {
            //ARRANGE
            FizzBuzz fb = new FizzBuzz();
            String expected = "1 2 Fizz 4 Buzz ";
            //ACT
            String result = fb.getFizzBuzz(1,5);
            //ASSERT
            assertEquals(expected, result);
        }
        @Test
        void testReturnsTrueFor30() {
            //ARRANGE
            FizzBuzz fb = new FizzBuzz();
            String expected = "Buzz Fizz 7 8 Fizz Buzz ";
            //ACT
            String result = fb.getFizzBuzz(5,10);
            //ASSERT
            assertEquals(expected, result);
        }
        @Test
        void testReturnsTrueWith12345() {
            //ARRANGE
            FizzBuzz fb = new FizzBuzz();
            String expected = "Buzz 11 Fizz 13 14 FizzBuzz ";
            //ACT
            String result = fb.getFizzBuzz(10,15);
            //ASSERT
            assertEquals(expected, result);
        }
    }
}