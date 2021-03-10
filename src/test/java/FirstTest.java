import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {

    @Test
    void test() {
        Boolean actual = Utility.returnBool();
        assertTrue(actual);
    }

    @Test
    void isBiggerTest() {
        Boolean actual = Utility.isLarger(5,3);
        assertTrue(actual);
    }

    @Test
    void addTest() {
        int actual = Utility.addInts(10, 21);
        int expected = 31;

        assertEquals(expected, actual);
    }

    @Test
    void addAnotherTest() {
        int actual = Utility.addInts(15, 11);
        int expected = 26;

        assertEquals(expected, actual);
    }

}
