import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown()
    {
        stringCalculator = null;
    }

    @Test
    public void testNegative(){
        assertEquals(stringCalculator.add("-2, 7"), "negatives not allowed");
    }

    @Test
    public void testLargeNum(){
        assertEquals(stringCalculator.add("5, 2, 1004"), 7);
    }
}
