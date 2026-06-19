package RockPaperScissors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {
    @Test
    void RockBeatsScissorsUserWins() {
        //ARRANGE
        RockPaperScissors rps = new RockPaperScissors();
        String expected = "user won";
        //ACT
        String result = rps.getWinner("Rock", "Scissors");
        //ASSERT
        assertEquals(expected, result);
    }
    @Test
    void RockLosesToPaperCompWins() {
        //ARRANGE
        RockPaperScissors rps = new RockPaperScissors();
        String expected = "comp won";
        //ACT
        String result = rps.getWinner("Rock", "Paper");
        //ASSERT
        assertEquals(expected, result);
    }
    @Test
    void RockDrawsWithRock() {
        //ARRANGE
        RockPaperScissors rps = new RockPaperScissors();
        String expected = "draw";
        //ACT
        String result = rps.getWinner("Rock", "Rock");
        //ASSERT
        assertEquals(expected, result);
    }
}