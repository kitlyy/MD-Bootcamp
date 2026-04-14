package passwordChecker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PasswordCheckerTest {

    @Nested
    class NoInput {
        @Test
        void shouldReturnFalseWhenProvidedAnEmptyPassword() {
            PasswordChecker checker = new PasswordChecker();
            boolean result = checker.validatePassword("");
            assertFalse(result);
        }
    }

    @Nested
    class LessThan8Characters {
        @Test
        public void passwordWithLessThan8Characters() {
            PasswordChecker checker = new PasswordChecker();
            boolean result = checker.validatePassword("asdf123");
            assertFalse(result);
        }
        @Test
        public void passwordWithLetterAndNumberBut7Characters() {
            PasswordChecker checker = new PasswordChecker();
            boolean result = checker.validatePassword("asdf123");
            assertFalse(result);
        }
        @Test
        public void passwordWithoutLettersAnd4Characters() {
            PasswordChecker checker = new PasswordChecker();
            boolean result = checker.validatePassword("1234");
            assertFalse(result);
        }
        public void passwordWithoutNumbersAnd4Characters() {
            PasswordChecker checker = new PasswordChecker();
            boolean result = checker.validatePassword("asdf");
            assertFalse(result);
        }
    }

    @Nested
    class Has8Characters {
        @Test
        void passwordWith8CharactersButNoNumbers() {
            PasswordChecker checker = new PasswordChecker();
            boolean result = checker.validatePassword("asdfghjk");
            assertFalse(result);
        }

        @Test
        void passwordWith8CharactersButNoLetters() {
            PasswordChecker checker = new PasswordChecker();
            boolean result = checker.validatePassword("12345678");
            assertFalse(result);
        }

        @Test
        void passwordWith8CharactersAndOneLetter() {
            PasswordChecker checker = new PasswordChecker();
            boolean result = checker.validatePassword("1234567a");
            assertTrue(result);
        }

        @Test
        void passwordWith8CharactersAndOneNumber() {
            PasswordChecker checker = new PasswordChecker();
            boolean result = checker.validatePassword("asdfghj1");
            assertTrue(result);
        }

        @Test
        void PerfectPassword() {
            PasswordChecker checker = new PasswordChecker();
            boolean result = checker.validatePassword("l.;5.61&");
            assertTrue(result);
        }
    }
}