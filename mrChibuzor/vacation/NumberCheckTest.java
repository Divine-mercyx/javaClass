package mrChibuzor.vacation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumberCheckTest {

    @Test
    public void testNumberCheck() {
        int[] list = {23, 45, 76, 12, 33, 89};

        String actual = NumberCheck.checkNumber(list, -100);
        String expected = "not available";
        assertEquals(expected, actual);

    }


    @Test
    public void testNumberOfPositiveANdNegativeAndZero() {

        int[] list = {23, 45, 76, 12, 33, 89};

        int[] actual = NumberCheck.checkNumberOfPositiveAndNegative(list);
        int[] expected = {6, 0, 0};
        assertArrayEquals(expected, actual);
    }
}
