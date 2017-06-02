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
        int inputMatchCount = 0;
        for (char inputElement : input.toCharArray()) {
            if (puzzle.indexOf(inputElement) != -1) {
                inputMatchCount = inputMatchCount + 1;
            }
        }

        return String.format("0A%dB", inputMatchCount);
    }
}
