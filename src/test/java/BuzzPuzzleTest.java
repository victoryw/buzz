import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuzzPuzzleTest {

    private BuzzPuzzle puzzle;

    @Before
    public void setUp() throws Exception {
        String puzzleStr = "1234";
        FixedPuzzleBuilder fixedPuzzleBuilder = new FixedPuzzleBuilder(puzzleStr);
        puzzle = new BuzzPuzzle(fixedPuzzleBuilder);
    }

    @Test
    public void should_puzzle_more_than_one_correct_char_but_position_wrong(){

        String answer = puzzle.solve("0021");
        assertEquals("0A2B",answer);
    }

    @Test
    public void should_puzzle_more_than_the_chars_is_correct_and_position_right(){
        BuzzPuzzle puzzle = this.puzzle;
        String answer = puzzle.solve("1200");
        assertEquals("2A0B",answer);
    }

    @Test
    public void should_puzzle_the_position_value_all_right_and_only_value_matched(){
        BuzzPuzzle puzzle = this.puzzle;
        String answer = puzzle.solve("1203");
        assertEquals("2A1B",answer);
    }

    @Test
    public void should_tell_us_empty_when_nothing_matched(){
        BuzzPuzzle puzzle = this.puzzle;
        String answer = puzzle.solve("0000");
        assertEquals("",answer);
    }
}

