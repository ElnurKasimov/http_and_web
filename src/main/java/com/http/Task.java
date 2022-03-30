package com.http;

public class Task {
    int userId;
    int id;
    String title;
    String completed;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "{ \n" +
                "\t\"userId\":  " + userId + ",\n" +
                "\t\"id\":  " + id + ",\n" +
                "\t\"title\":  \"" + title + "\",\n" +
                "\t\"completed\":  \"" + completed + "\"\n" +
                "}";
    }
}
