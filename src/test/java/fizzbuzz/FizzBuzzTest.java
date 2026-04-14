package fizzbuzz;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Nested
    class SingleFizz {
        @Test
        void testReturnsTrueFor3() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(3, 3);
            assertEquals("Fizz ", result);
        }

        @Test
        void testReturnsTrueFor6() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(6, 6);
            assertEquals("Fizz ", result);
        }

        @Test
        void testReturnsTrueFor1959() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(1959, 1959);
            assertEquals("Fizz ", result);
        }
    }
    @Nested
    class SingleBuzz {
        @Test
        void testReturnsTrueFor5() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(5,5);
            assertEquals("Buzz ", result);
        }
        @Test
        void testReturnsTrueFor10() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(10,10);
            assertEquals("Buzz ", result);
        }
        @Test
        void testReturnsTrueFor125() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(125,125);
            assertEquals("Buzz ", result);
        }
    }
    @Nested
    class SingleFizzBuzz {
        @Test
        void testReturnsTrueFor15() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(15,15);
            assertEquals("FizzBuzz ", result);
        }
        @Test
        void testReturnsTrueFor30() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(30,30);
            assertEquals("FizzBuzz ", result);
        }
        @Test
        void testReturnsTrueWith12345() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(12345,12345);
            assertEquals("FizzBuzz ", result);
        }
    }
    @Nested
    class RangeOfNumbers {
        @Test
        void testReturnsTrueFor15() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(15,15);
            assertEquals("FizzBuzz ", result);
        }
        @Test
        void testReturnsTrueFor30() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(30,30);
            assertEquals("FizzBuzz ", result);
        }
        @Test
        void testReturnsTrueWith12345() {
            FizzBuzz fb = new FizzBuzz();
            String result = fb.getFizzBuzz(12345,12345);
            assertEquals("FizzBuzz ", result);
        }
    }
}