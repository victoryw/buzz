import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class BuzzPuzzle {
    private String puzzle;

    public BuzzPuzzle(String puzzle) {

        this.puzzle = puzzle;
    }

    public String solve(String input) {
        ImmutableList<Character> inputChars = Lists.charactersOf(input);

        long inputMatchCount = inputChars.stream().
                filter(inputChar -> puzzle.indexOf(inputChar) != -1).
                count();

        return String.format("0A%dB", inputMatchCount);
    }
}
