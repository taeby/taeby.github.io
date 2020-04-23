import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wymstar on 6/27/16.
 */
public class StringCalculatorTest {
    StringCalculator calculator;

    @Before
    public void setup() {
        calculator = new StringCalculator();
    }

    @Test
    public void test_sumWithEmptyString() {
        assertEquals(calculator.sum(""), 0);
    }

    @Test
    public void test_sumWithNull() {
        assertEquals(calculator.sum(null), 0);
    }

    @Test
    public void test_sumByDefaultDelimeter() {
        assertEquals(calculator.sum("1"), 1);
        assertEquals(calculator.sum("1,2"), 3);
        assertEquals(calculator.sum("1:2,3"), 6);
    }

    @Test
    public void test_sumByCustomDelimiter() {
        assertEquals(calculator.sum("//##\n4##5##7"), 16);
        assertEquals(calculator.sum("//&\n1&5&2"), 8);
    }

    @Test(expected = NegativeNumberException.class)
    public void test_exceptionTest1() {
        calculator.sum("//##\n4##-5##7");
    }

    @Test(expected = NegativeNumberException.class)
    public void test_exceptionTest2() {
        calculator.sum("1,2,-3");
    }
}