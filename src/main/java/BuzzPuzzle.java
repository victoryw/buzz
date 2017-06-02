import com.google.common.primitives.Chars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuzzPuzzle {
    private String puzzle;

    public BuzzPuzzle(String puzzle) {

        this.puzzle = puzzle;
    }

    public String solve(String input) {
        boolean isRight = false;
        for (char inputElement : input.toCharArray()) {
            if (puzzle.indexOf(inputElement) != -1) {
                isRight = true;
            }
        }

        return String.format("0A%dB", isRight ? 1 : 0);
    }
}
