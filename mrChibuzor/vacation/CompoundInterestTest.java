import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompoundInterestTest {

    @Test
    public void testCompoundInterest() {
        mrChibuzor.vacation.CompoundInterest compoundInterest = new mrChibuzor.vacation.CompoundInterest();
        double actual = compoundInterest.getCompoundInterest(1000, 500, 10, 5, 12);
        double expected = 79288.14922052388;
        assertEquals(expected, actual);
    }
}