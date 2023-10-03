package Diary;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DiariesTest {

    private Diaries diaries;

    @Before
    public void setUp() {
        diaries = new Diaries();
    }

    @Test
    public void testAdd() {
        diaries.add("user1", "password1");
        Diary foundDiary = diaries.findByUsername("user1");
        assertNotNull(foundDiary);
        assertEquals("user1", foundDiary.getUsername());
    }

    @Test
    public void testFindByUsername() {
        diaries.add("user1", "password1");
        diaries.add("user2", "password2");
        Diary foundDiary = diaries.findByUsername("user1");
        assertNotNull(foundDiary);
        assertEquals("user1", foundDiary.getUsername());

        Diary nonExistentDiary = diaries.findByUsername("nonexistent");
        assertNull(nonExistentDiary);
    }

    @Test
    public void testDelete() {
        diaries.add("user1", "password1");
        diaries.delete("user1", "password1");
        Diary deletedDiary = diaries.findByUsername("user1");
        assertNull(deletedDiary);
        diaries.delete("nonexistent", "password");
    }
}