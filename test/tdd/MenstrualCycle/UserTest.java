package tdd;

import MenstrualCycle.User;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserTest {

    @Test
    public void testGetNameAndSetName() {
        User user = new User("Esther", 30, "Esther@example.com");
        assertEquals("Esther", user.getName());
        user.setName("Esther");
        assertEquals("Esther", user.getName());
    }

    @Test
    public void testGetAgeAndSetAge() {
        User user = new User("Esther", 30, "Esther@example.com");
        assertEquals(30, user.getAge());
        user.setAge(35);
        assertEquals(35, user.getAge());
    }

    @Test
    public void testGetContactDetailsAndSetContactDetails() {
        User user = new User("Esther", 30, "Esther@example.com");
        assertEquals("Esther@example.com", user.getNumber());
        user.setNumber("jane@example.com");
        assertEquals("jane@example.com", user.getNumber());
    }
}
