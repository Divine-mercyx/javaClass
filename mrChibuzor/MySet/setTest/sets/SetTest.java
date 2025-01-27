package sets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Sets sets;

    @BeforeEach
    public void setUp() {
        sets = new Sets();
    }

    @Test
    public void addX_checkIfEmpty() {
        sets.add("d-strings");
        assertFalse(sets.isEmpty());
    }


    @Test
    public void addXY_sizeIsOneTest() {
        sets.add("d-strings");
        sets.add("d-strings");
        assertEquals(1, sets.size());
    }


    @Test
    public void addXY_containsXCheck_testSet() {
        sets.add("d-strings");
        sets.add("g-strings");
        assertTrue(sets.contains("d-strings"));
        assertFalse(sets.contains("f-strings"));
    }

    @Test
    public void addXY_removeX_checkSize_testSets() {
        sets.add("d-strings");
        sets.add("g-strings");
        sets.remove("d-strings");
        assertEquals(1, sets.size());
        assertFalse(sets.isEmpty());
    }

    @Test
    public void addXY_returnArray_testSets() {
        sets.add("d-strings");
        sets.add("g-strings");
        String[] actual = sets.toArray();
        assertArrayEquals(new String[]{"d-strings","g-strings", null, null}, actual);
    }

    @Test
    public void addCollection_returnArray_testSets() {
        String[] values = {"boy", "girl", "mother"};
        sets.retainAll(values);
        assertArrayEquals(new String[]{"boy", "girl", "mother", null}, sets.toArray());
    }
}