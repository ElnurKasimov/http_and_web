package com.http;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.print("Введите id пользователя (от 1 до 10), комменнтарии к последнему посту которого вас интересуют :");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        List<Post> posts = HttpUtillities.getAllPostsDeterminedUser("/users/" + id + "/posts");
        int maxPostId = posts.stream().
                map(post -> post.id).
                max((i1, i2) -> i1-i2).
                get();
        System.out.println("Максимальный post у пользователя с id " + id + " : " + maxPostId);
        String path = "src/main/resources/user-" + id + "-post-" + maxPostId+ "-comments.json";
        Files.writeString(Paths.get(path), HttpUtillities.getAllCommentsOnMaxPost("/posts/" + maxPostId + "/comments"));
    }
}

