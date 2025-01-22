package ArrayLists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    private ArrayList1 arrayList;

    @BeforeEach
    public void createArrayListsObject() {
        arrayList = new ArrayList1();
    }


    @Test
    public void ArrayListsCheck_testIfItExist() {
        arrayList.add("boy");
        assertEquals("boy", arrayList.get(0));
    }

    @Test
    public void addxy_getxy_testArrayList() {
        arrayList.add("boy");
        arrayList.add("girl");
        assertEquals("boy", arrayList.get(0));
        assertEquals("girl", arrayList.get(1));
        assertEquals(2, arrayList.size());
    }

    @Test
    public void addxy_removex_textArrayListSize() {
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.add("girl");
        arrayList.remove("boy");
        assertEquals(2, arrayList.size());
    }


    @Test
    public void addxy_removexy_testArrayListIfEmpty() {
        arrayList.add("boy");
        arrayList.add("girl");
        assertFalse(arrayList.isEmpty());
        arrayList.remove("boy");
        arrayList.remove("girl");
        assertTrue(arrayList.isEmpty());
    }


    @Test
    public void addvwxyz_testArrayListLimit() {
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.add("girl");
        arrayList.add("girl");
        arrayList.add("girl");
        assertEquals(5, arrayList.size());
    }


    @Test
    public void addXY_removeY_testArrayListIndex() {
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.remove("boy");
        assertEquals("girl", arrayList.get(0));
    }


    @Test
    public void addX_checkIfArrayListContainsAElement() {
        arrayList.add("boy");
        assertTrue(arrayList.contains("boy"));
        assertFalse(arrayList.contains("girl"));
        arrayList.remove("boy");
        assertFalse(arrayList.contains("boy"));
    }


    @Test
    public void addXY_clearAll_testArrayListSize() {
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.clear();
        assertEquals(0, arrayList.size());
        arrayList.add("boy");
        assertEquals(1, arrayList.size());
    }

    @Test
    public void addXY_getIndexOf_testArrayList() {
        arrayList.add("boy");
        arrayList.add("girl");
        assertEquals(0, arrayList.indexOf("boy"));
        assertEquals(1, arrayList.indexOf("girl"));
    }

    @Test
    public void addXY_addToSpecifiedIndex_arrayListTest() {
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.add("father");
        arrayList.add(1, "mother");
        assertEquals(1, arrayList.indexOf("mother"));
        assertEquals(2, arrayList.indexOf("girl"));
    }

}