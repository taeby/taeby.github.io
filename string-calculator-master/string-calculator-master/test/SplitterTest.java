import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by wymstar on 6/27/16.
 */
public class SplitterTest {

    @Test
    public void test_split_emptyText() {
        assertArrayEquals(Splitter.splitToIntList(""), new int[1]);
    }

    @Test
    public void test_split_null() {
        assertArrayEquals(Splitter.splitToIntList(null), new int[1]);
    }

//    @Test
//    public void test_extractCustomDelimiter() {
//        assertEquals(Splitter.extractCustomDelimiter("//er\n"), "er");
//        assertEquals(Splitter.extractCustomDelimiter("//;\n"), ";");
//    }

    @Test
    public void test_split() {
        assertArrayEquals(Splitter.splitToIntList("1,2"), new int[]{1,2});
        assertArrayEquals(Splitter.splitToIntList("4,2,3"), new int[]{4,2,3});
    }

    @Test
    public void test_splitByCustomDelimiter_emptyText() {
        assertArrayEquals(Splitter.splitToIntList(""), new int[1]);
    }

    @Test
    public void test_splitByCustomDelimiter_null() {
        assertArrayEquals(Splitter.splitToIntList(null), new int[1]);
    }



}
