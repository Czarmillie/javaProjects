package Diary;

import java.util.ArrayList;
import java.util.List;

class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }

    public boolean unlockDiary(String password) {
        try {
            if (this.password.equals(password)) {
                isLocked = false;
                return true;
            } else {
                throw new Exception("Incorrect password. Diary remains locked.");
            }
        } catch (Exception e) {
            System.err.println("Error unlocking diary: " + e.getMessage());
            return false;
        }
    }

    public void lockDiary() {
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(int ID, String title, String body) {
        try {
            if (!isLocked) {
                Entry entry = new Entry(ID, title, body);
                entries.add(entry);
            } else {
                throw new Exception("Diary is locked. Cannot create an entry.");
            }
        } catch (Exception e) {
            System.err.println("Error while creating entry: " + e.getMessage());
        }
    }

    public void deleteEntry(int id) {
        try {
            if (!isLocked) {
                entries.removeIf(entry -> entry.getId() == id);
            } else {
                throw new Exception("Diary is locked. Cannot delete an entry.");
            }
        } catch (Exception e) {
            System.err.println("Error deleting entry: " + e.getMessage());
        }
    }

    public Entry findEntryById(int entryId) {
        for (Entry entry : entries) {
            if (entry.getId() == entryId) {
                return entry;
            }
        }
        return null;
    }

    public void updateEntry(Entry entry, String newTitle, String newBody) {
        try {
            if (!isLocked) {
                entry.setTitle(newTitle);
                entry.setBody(newBody);
            } else {
                throw new Exception("Diary is locked. Cannot update an entry.");
            }
        } catch (Exception e) {
            System.err.println("Error updating entry: " + e.getMessage());
        }
    }

    public List<Entry> getEntries() {
        try {
            if (!isLocked) {
                return entries;
            } else {
                throw new Exception("Diary is locked. Cannot access entries.");
            }
        } catch (Exception e) {
            System.err.println("Error accessing entries: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}