package com.http;

public class Comment {
    int postId;
    int id;
    String name;
    String email;
    String body;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "{ \n" +
                "\t\"postId\":  " + postId +",\n" +
                "\t\"id\":  " + id +",\n" +
                "\t\"name\":  \"" + name +  "\",\n"+
                "\t\"email\":  \"" + email +  "\",\n"+
                "\t\"body\":  \"" + body + "\"\n"+
                "}";
    }
}
