package tdd.Diary;

package tdd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiaryTest {
    private Diary diary;

    @Before
    public void setUp() {
        diary = new Diary("testuser", "testpassword");
    }

    @Test
    public void testUnlockDiary() {
        diary.unlockDiary("testpassword");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testUnlockDiaryIncorrectPassword() {
        diary.unlockDiary("wrongpassword");
        assertTrue(diary.isLocked());
    }

    @Test
    public void testLockDiary() {
        diary.unlockDiary("testpassword");
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testCreateEntry() {
        diary.unlockDiary("testpassword");
        diary.createEntry("Entry 1", "This is the first entry.");
        assertEquals(1, diary.getEntries().size());
    }

    @Test
    public void testCreateEntryWhenLocked() {
        diary.createEntry("Entry 1", "This is the first entry.");
        assertEquals(0, diary.getEntries().size());
    }

    @Test
    public void testDeleteEntry() {
        diary.unlockDiary("testpassword");
        diary.createEntry("Entry 1", "This is the first entry.");
        diary.createEntry("Entry 2", "This is the second entry.");

        diary.deleteEntry(1);
        assertEquals(1, diary.getEntries().size());
    }

    @Test
    public void testDeleteEntryWhenLocked() {
        diary.createEntry("Entry 1", "This is the first entry.");
        diary.deleteEntry(1);
        assertEquals(0, diary.getEntries().size());
    }

    @Test
    public void testFindEntryById() {
        diary.unlockDiary("testpassword");
        diary.createEntry("Entry 1", "This is the first entry.");

        Entry entry = diary.findEntryById(1);
        assertNotNull(entry);
        assertEquals("Entry 1", entry.getTitle());
    }

    @Test
    public void testFindEntryByIdWhenEntryNotFound() {
        diary.unlockDiary("testpassword");
        diary.createEntry("Entry 1", "This is the first entry.");

        Entry entry = diary.findEntryById(2);
        assertNull(entry);
    }

    @Test
    public void testUpdateEntry() {
        diary.unlockDiary("testpassword");
        diary.createEntry("Entry 1", "This is the first entry.");

        diary.updateEntry(1, "Updated Entry 1", "This entry has been updated.");
        Entry updatedEntry = diary.findEntryById(1);

        assertNotNull(updatedEntry);
        assertEquals("Updated Entry 1", updatedEntry.getTitle());
        assertEquals("This entry has been updated.", updatedEntry.getBody());
    }
}
