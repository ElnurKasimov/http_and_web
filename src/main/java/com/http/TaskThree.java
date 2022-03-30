package com.http;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.print("Введите id пользователя (от 1 до 10), незактые задачи которого вас интересуют :");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println("Для пользователя с id " + id + "открытые задачи следующие:");
        HttpUtillities.getAllOpenTasks("/users/" + id + "/todos");
    }
}
