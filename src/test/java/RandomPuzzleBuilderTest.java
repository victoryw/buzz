import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class RandomPuzzleBuilderTest {
    @Test
    public void should_build_random_puzzle(){
        RandomPuzzleBuilder builder = new RandomPuzzleBuilder();
        String firstPuzzle = builder.getPuzzle();

        Assert.assertTrue(StringUtils.isNumeric(firstPuzzle));
        Assert.assertEquals(4,firstPuzzle.length());

        String secondPuzzle = builder.getPuzzle();
        Assert.assertNotEquals(firstPuzzle,secondPuzzle);
    }
}
