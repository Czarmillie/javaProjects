package Diary;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "WELCOME TO YOUR DIARY HAVEN 📖✨\n" +
                        "STEP INTO THE WORLD OF YOUR THOUGHTS, DREAMS, AND MEMORIES.\n" +
                        "YOUR JOURNEY BEGINS NOW – HAPPY WRITING!");
        Diaries diaries = new Diaries();

        while (true) {
                String input = JOptionPane.showInputDialog(
                        """
                                Main Menu
                                1. Create Diary
                                2. Unlock Diary
                                3. Lock Diary
                                4. Create Entry
                                5. Delete Entry
                                6. Update Entry
                                7. Find Entry by ID
                                8. Exit

                                Choose an action:""");
                if (input == null) {
                    JOptionPane.showMessageDialog(null, "Exiting the program.");
                    System.exit(0);
                }
                try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1: {
                        String username = JOptionPane.showInputDialog("Enter username for the new diary:");
                        String password = JOptionPane.showInputDialog("Enter password for the new diary:");
                        diaries.add(username, password);
                        JOptionPane.showMessageDialog(null, "Diary created.");
                        break;
                    }

                    case 2: {
                        String unlockUsername = JOptionPane.showInputDialog("Enter username to unlock the diary:");
                        String unlockPassword = JOptionPane.showInputDialog("Enter the password:");
                        Diary unlockedDiary = diaries.findByUsername(unlockUsername);
                        if (unlockedDiary != null) {
                            boolean unlocked = unlockedDiary.unlockDiary(unlockPassword);
                            if (unlocked) {
                                JOptionPane.showMessageDialog(null, "Diary unlocked successfully.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Incorrect password. Diary is still locked.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Diary not found.");
                        }
                        break;
                    }
                    case 3: {
                        String lockUsername = JOptionPane.showInputDialog("Enter username to lock the diary:");
                        Diary lockedDiary = diaries.findByUsername(lockUsername);
                        if (lockedDiary != null) {
                            lockedDiary.lockDiary();
                            JOptionPane.showMessageDialog(null, "Diary locked.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Diary not found.");
                        }
                        break;
                    }
                    case 4: {
                        String createUsername = JOptionPane.showInputDialog("Enter username to create an entry:");
                        Diary createDiary = diaries.findByUsername(createUsername);
                        if (createDiary != null) {
                            int entryId = Integer.parseInt(JOptionPane.showInputDialog("Enter entry ID:"));
                            String entryTitle = JOptionPane.showInputDialog("Enter entry title:");
                            String entryBody = JOptionPane.showInputDialog("Enter entry body:");
                            createDiary.createEntry(entryId, entryTitle, entryBody);
                            JOptionPane.showMessageDialog(null, "Entry created.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Diary not found.");
                        }
                        break;
                    }
                    case 5: {
                        String deleteUsername = JOptionPane.showInputDialog("Enter username to delete an entry:");
                        Diary deleteDiary = diaries.findByUsername(deleteUsername);
                        if (deleteDiary != null) {
                            int entryId = Integer.parseInt(JOptionPane.showInputDialog("Enter entry ID to delete:"));
                            deleteDiary.deleteEntry(entryId);
                            JOptionPane.showMessageDialog(null, "Entry deleted.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Diary not found.");
                        }
                        break;
                    }
                    case 6: {
                        String updateUsername = JOptionPane.showInputDialog("Enter username to update an entry:");
                        Diary updateDiary = diaries.findByUsername(updateUsername);
                        if (updateDiary != null) {
                            int updateEntryId = Integer.parseInt(JOptionPane.showInputDialog("Enter entry ID to update:"));
                            Entry entryToUpdate = updateDiary.findEntryById(updateEntryId);
                            if (entryToUpdate != null) {
                                String newEntryTitle = JOptionPane.showInputDialog("Enter new entry title:");
                                String newEntryBody = JOptionPane.showInputDialog("Enter new entry body:");
                                entryToUpdate.setTitle(newEntryTitle);
                                entryToUpdate.setBody(newEntryBody);
                                JOptionPane.showMessageDialog(null, "Entry updated.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Entry not found.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Diary not found.");
                        }
                        break;
                    }
                    case 7: {
                        String findUsername = JOptionPane.showInputDialog("Enter username to find an entry:");
                        Diary findDiary = diaries.findByUsername(findUsername);
                        if (findDiary != null) {
                            int findEntryId = Integer.parseInt(JOptionPane.showInputDialog("Enter entry ID to find:"));
                            Entry foundEntry = findDiary.findEntryById(findEntryId);
                            if (foundEntry != null) {
                                JOptionPane.showMessageDialog(null, "Entry details:\n" + foundEntry.formatEntry());
                            } else {
                                JOptionPane.showMessageDialog(null, "Entry not found.");
                            }
                            } else {
                                JOptionPane.showMessageDialog(null, "Diary not found.");
                        }
                        break;
                    }

                    case 8: {
                        JOptionPane.showMessageDialog(null, "Exiting the program.");
                        System.exit(0);
                        break;
                    }
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input format. Please enter a valid number.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}