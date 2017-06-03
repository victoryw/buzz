public class FixedPuzzleBuilder implements PuzzleBuilder {
    private String puzzle;

    public FixedPuzzleBuilder(String puzzleStr) {
        this.puzzle = puzzleStr;
    }

    @Override
    public String getPuzzle() {
        return puzzle;
    }
}
