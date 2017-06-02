import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuzzPuzzleTest {

    @Test
    public void should_puzzle_one_correct_char(){
        String puzzleStr = "1234";
        BuzzPuzzle puzzle = new BuzzPuzzle(puzzleStr);
        String answer = puzzle.solve("0001");
        assertEquals("0A1B",answer);
    }

}
