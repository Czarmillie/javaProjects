package Diary;

import java.util.ArrayList;
import java.util.List;

class Diaries {
    private List<Diary> diaries;

    public Diaries() {
        this.diaries = new ArrayList<>();
    }

    public void add(String username, String password) {
        try {
            Diary diary = new Diary(username, password);
            diaries.add(diary);
        } catch (IllegalArgumentException e) {
            System.err.println("Error while adding a diary: " + e.getMessage());
            System.err.println("Failed to add diary. Please provide a valid username and password.");
        }
    }

    public Diary findByUsername(String username) {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) {
                return diary;
            }
        }
        return null;
    }

    public void delete(String username, String password) {
        try {
            Diary diary = findByUsername(username);
            if (diary != null && diary.isLocked() && diary.getPassword().equals(password)) {
                diaries.remove(diary);
            } else {
                System.out.println("Diary not found or password incorrect. Cannot delete.");
            }
        } catch (Exception e) {
            System.err.println("Error while deleting a diary: " + e.getMessage());
            System.err.println("Failed to delete diary. An unexpected error occurred.");
        }
    }
}