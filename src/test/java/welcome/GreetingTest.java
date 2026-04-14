package welcome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {
    @Test
    public void testGetGreeting() {
        Greeting hello = new Greeting("Kit");
        String result = hello.getGreeting();
        String expected = "Hello Kit. How are you today?";
        assertEquals(expected, result);
    }
}