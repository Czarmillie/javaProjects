package Diary;

import java.time.LocalDateTime;

class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        try {
            this.dateCreated = LocalDateTime.now();
        } catch (Exception e) {
            System.err.println("Error while getting the current date and time: " + e.getMessage());
            System.err.println("Failed to create Entry. Please try again later.");
        }
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        try {
            this.title = title;
        } catch (Exception e) {
            System.err.println("Error while setting the title: " + e.getMessage());
            System.err.println("Failed to update title. Please try again with a different title.");
        }
    }

    public void setBody(String body) {
        try {
            this.body = body;
        } catch (Exception e) {
            System.err.println("Error while setting the body: " + e.getMessage());
            System.err.println("Failed to update body. Please try again with a different body.");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getEntry() {
        return this.title + " " + this.body;
    }

    public String formatEntry() {
        return "Title: " + this.title + "\nBody: " + this.body;
    }
}
