import org.apache.commons.lang3.RandomStringUtils;

public class RandomPuzzleBuilder implements PuzzleBuilder {
    @Override
    public String getPuzzle() {
        return RandomStringUtils.random(4,false,true);
    }
}
