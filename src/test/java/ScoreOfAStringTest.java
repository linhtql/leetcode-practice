import static org.junit.jupiter.api.Assertions.*;

import algorithms.ScoreOfAString;
import org.junit.jupiter.api.Test;

public class ScoreOfAStringTest {
    @Test
    void testCase1() {
        assertEquals(13, ScoreOfAString.scoreOfString("hello"));
    }

    @Test
    void testCase2() {
        assertEquals(13, ScoreOfAString.scoreOfString("zaz"));
    }
}
