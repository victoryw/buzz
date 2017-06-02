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

        long inputValueAndPositionMatchedCount = inputChars.stream().
                filter(inputChar -> {
                    int inputCharPosInPuzzle = puzzle.indexOf(inputChar);
                    int inputCharPosInInput = input.indexOf(inputChar);
                    return inputCharPosInPuzzle != -1
                            && inputCharPosInInput == inputCharPosInPuzzle;
                }).
                count();

        long onlyValueMatchedCount = inputMatchCount - inputValueAndPositionMatchedCount;
        return String.format("%dA%dB",
                inputValueAndPositionMatchedCount,
                onlyValueMatchedCount);
    }
}
