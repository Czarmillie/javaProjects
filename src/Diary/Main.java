package Diary;

public class Main {
    public static void main(String[] args) {
        Diaries diaries = new Diaries();

        diaries.add("user1", "password1");
        diaries.add("user2", "password2");

        Diary user1Diary = diaries.findByUsername("user1");
        if (user1Diary != null) {
            user1Diary.unlockDiary("password1");
            user1Diary.createEntry("Entry 1", "This is the first entry.");
            user1Diary.createEntry("Entry 2", "This is the second entry.");

            Entry entry = user1Diary.findEntryById(1);
            if (entry != null) {
                user1Diary.updateEntry(1, "Updated Entry 1", "This entry has been updated.");
                user1Diary.deleteEntry(2);
            }
            user1Diary.lockDiary();
        }
    }
}
