import algorithms.CrawlerLogFolder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CrawlerLogFolderTest {

    @Test
    void testCase1() {
        assertEquals(2, CrawlerLogFolder.minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
    }

    @Test
    void testCase2() {
        assertEquals(3, CrawlerLogFolder.minOperations(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"}));
    }

    @Test
    void testCase3() {
        assertEquals(0, CrawlerLogFolder.minOperations(new String[]{"d1/", "../", "../", "../"}));
    }
}
