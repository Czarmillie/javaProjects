//package Diary;
//
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class DiaryTest {
//    private Diary diary;
//
//    @Before
//    public void setUp() {
//        diary = new Diary("Czarmillie", "1234");
//    }
//
//    @Test
//    public void testUnlockDiary() {
//        diary.unlockDiary("1234");
//        assertFalse(diary.isLocked());
//    }
//
//    @Test
//    public void testUnlockDiaryIncorrectPassword() {
//        diary.unlockDiary("wrong password");
//        assertTrue(diary.isLocked());
//    }
//
//    @Test
//    public void testLockDiary() {
//        diary.unlockDiary("1234");
//        diary.lockDiary();
//        assertTrue(diary.isLocked());
//    }
//
//    @Test
//    public void testCreateEntry() {
//        diary.unlockDiary("1234");
//        diary.createEntry(1, "This is the first entry.", "Entry body");
//        assertEquals(1, diary.getEntries().size());
//    }
//
//    @Test
//    public void testCreateEntryWhenLocked() {
//        diary.createEntry(0, "This is the first entry.", "Entry body");
//        assertEquals(0, diary.getEntries().size());
//    }
//
//    @Test
//    public void testDeleteEntry() {
//        diary.unlockDiary("1234");
//        diary.createEntry(1, "This is the first entry.", "Entry body");
//        diary.createEntry(1, "This is the second entry.", "Entry body");
//
//        diary.deleteEntry(1);
//        assertEquals(0, diary.getEntries().size());
//    }
//
//    @Test
//    public void testDeleteEntryWhenLocked() {
//        diary.createEntry(1, "This is the first entry.", "Entry body");
//        diary.deleteEntry(1);
//        assertEquals(0, diary.getEntries().size());
//    }
//
//    @Test
//    public void testFindEntryById() {
//        diary.unlockDiary("1234");
//        diary.createEntry(1, "This is the first entry.", "Entry body");
//
//        Entry entry = diary.findEntryById(1);
//        assertNotNull(entry);
//        assertEquals("This is the first entry.", entry.getTitle());
//    }
//
////    @Test
////    public void testFindEntryByIdWhenEntryNotFound() {
////        diary.unlockDiary("1234");
////        diary.createEntry(2, "This is the first entry.", "Entry body");
////
////        Entry entry = diary.findEntryById(2);
////        assertNull(entry);
////    }
//
//    @Test
//    public void testUpdateEntry() {
//        diary.unlockDiary("1234");
//        diary.createEntry(1, "This is the first entry. ", "Entry body");
//        diary.updateEntry(1, "Entry 1 Updated ", "This is the first entry. This entry has been updated. ");
//        Entry updatedEntry = diary.findEntryById(1);
//
//        assertNotNull(updatedEntry);
//        assertEquals("Entry 1 Updated ", updatedEntry.getTitle());
//        assertEquals("This is the first entry. This entry has been updated. ", updatedEntry.getBody());
//    }
//}