package MyDairies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DairyTest {
    private Dairy dairy;

    @BeforeEach
    public void setUp() {
        dairy = new Dairy("fullname", "pin");
    }


    @Test
    public void lockDairy_testDairy() {
        dairy.lock();
        assertTrue(dairy.isLocked());
    }

    @Test
    public void unlockDairy_testDairy() {
        dairy.unlock("pin");
        assertFalse(dairy.isLocked());
    }


    @Test
    public void unlockDairyWithIncorrectPIn_testDairy() {
        assertThrows(IllegalArgumentException.class, () -> dairy.unlock("pin123"));
    }

    @Test
    public void unlockDairyWithNullPin_testDairy() {
        assertThrows(NullPointerException.class, () -> dairy.unlock(null));
    }

    @Test
    public void testToGetDairyUsername_whenLocked_testDairy() {
        dairy.lock();
        assertThrows(IllegalAccessError.class, () -> dairy.getUsername());
        dairy.unlock("pin");
        assertEquals("fullname", dairy.getUsername());
    }

    @Test
    public void createDairy_testToGetUsername_testDairy() {
        Dairy dairy = new Dairy("fullname1", "pin");
        assertEquals("fullname1", dairy.getUsername());
    }

    @Test
    public void testToCreateDairyWithWrongValues_testDairy() {
        assertThrows(NullPointerException.class, () -> new Dairy(null, "pin"));
        assertThrows(NullPointerException.class, () -> new Dairy("fullname", null));
    }

    @Test
    public void createEntry_checkDairySize_testDairy() {
        dairy.createEntry("title", "body");
        assertEquals(1, dairy.getSize());
        dairy.createEntry("title", "body");
        assertEquals(2, dairy.getSize());
    }


    @Test
    public void createEntryWithInvalidInput_testDairy() {
        assertThrows(NullPointerException.class, () -> dairy.createEntry(null, "body"));
        assertThrows(NullPointerException.class, () -> dairy.createEntry("title", null));
        assertThrows(IllegalArgumentException.class, () -> dairy.createEntry("title", ""));
        assertThrows(IllegalArgumentException.class, () -> dairy.createEntry("", "body"));
    }


    @Test
    public void createEntry_getEntryBodyTitle_testDairy() {
        Entry entry = dairy.createEntry("title", "body");
        assertEquals(1, entry.getId());
        assertEquals("title", entry.getTitle());
        assertEquals("body", entry.getBody());
    }

    @Test
    public void createTwoEntry_findEntryById_testentryId_testDairy() {
        dairy.createEntry("title", "body");
        dairy.createEntry("title2", "body2");
        Entry entry = dairy.findEntryById(1);
        assertEquals(1, entry.getId());
    }

    @Test
    public void createTwoEntry_findEntryById_testEntryContents_testDairy() {
        dairy.createEntry("title", "body");
        dairy.createEntry("title2", "body2");
        Entry entry = dairy.findEntryById(1);
        assertEquals("title", entry.getTitle());
    }

    @Test
    public void createTwoEntry_findEntryinvalidId_testDairy() {
        dairy.createEntry("title", "body");
        assertThrows(NoSuchElementException.class, () -> dairy.findEntryById(-1));
    }

    @Test
    public void createNoEntry_findEntryById_testDairy() {
        assertThrows(NoSuchElementException.class, () -> dairy.findEntryById(-1));
    }

    @Test
    public void createOneEntry_deleteEntryById_testDairy() {
        dairy.createEntry("title", "body");
        dairy.lock();
        assertThrows(IllegalAccessError.class, () -> dairy.deleteById(1));
        dairy.unlock("pin");
        dairy.deleteById(1);
        assertEquals(0, dairy.getSize());
    }


    @Test
    public void createOneEntry_deleteBYInvalidId_testDairy() {
        dairy.createEntry("title", "body");
        assertThrows(NoSuchElementException.class, () -> dairy.deleteById(-1));
    }

    @Test
    public void createOneEntry_lockentry_updateEntryById_testDairy() {
        dairy.createEntry("title", "body");
        dairy.lock();
        assertThrows(IllegalAccessError.class, () -> dairy.updateEntryById(1, "titles", "bodies"));
    }


    @Test
    public void createOneEntry_updateEntryWithInvalidValues_testDairy() {
        dairy.createEntry("title", "body");
        assertThrows(IllegalArgumentException.class, () -> dairy.updateEntryById(1, "", "bodies"));
        assertThrows(NoSuchElementException.class, () -> dairy.updateEntryById(-1, "titles", "bodies"));
        assertThrows(IllegalArgumentException.class, () -> dairy.updateEntryById(1, "titles", ""));
        assertThrows(NullPointerException.class, () -> dairy.updateEntryById(1, "titles", null));
    }


    @Test
    public void createOneEntry_updateEntryById_testDairy() {
        dairy.createEntry("title", "body");
        dairy.updateEntryById(1, "titles", "bodies");
        Entry entry = dairy.findEntryById(1);
        assertEquals("titles", entry.getTitle());
        assertEquals("bodies", entry.getBody());
        dairy.deleteById(1);
        assertEquals(0, dairy.getSize());
    }

}