import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuzzPuzzleTest {
    @Test
    public void should_puzzle_more_than_one_correct_char_but_position_wrong(){
        String puzzleStr = "1234";
        BuzzPuzzle puzzle = new BuzzPuzzle(puzzleStr);
        String answer = puzzle.solve("0021");
        assertEquals("0A2B",answer);
    }
}
