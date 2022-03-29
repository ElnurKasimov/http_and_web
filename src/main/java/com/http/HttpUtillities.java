package com.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpUtillities {
    public static final  HttpClient client = HttpClient.newHttpClient();
    public static final String URL = "https://jsonplaceholder.typicode.com";
    public static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void createNewObject (String endpoint, User myUser) throws IOException, InterruptedException {

        String requestBody = GSON.toJson(myUser);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL+endpoint))
                .header("Content-Type", "application/json; charset=utf-8")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        HttpResponse<String> responce =  client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Проверяем тело ответа. Если id у возвращенного объекта будет 11  - то все Ok.");
        System.out.println(responce.body());
    }

    public static void updateObject(HttpClient client ) {

    }

    public static void deleteObject(HttpClient client ) {

    }

    public static String getInformationAboutAllUsers (String endpoint) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(URL+endpoint)).
                GET().
                build();
        HttpResponse<String> responce =  client.send(request, HttpResponse.BodyHandlers.ofString());
        return responce.body();
    }

    public static User getInformationByID (String endpoint, int id ) throws IOException, InterruptedException {
        String requestURL = String.format("%s%s/%d", URL, endpoint, id);
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(requestURL)).
                GET().
                build();
        HttpResponse<String> responce =  client.send(request, HttpResponse.BodyHandlers.ofString());
        return GSON.fromJson(responce.body(), User.class);
    }

    public static User getInformationByUsername (String endpoint, String username ) throws IOException, InterruptedException {
        String requestURL = String.format("%s%s?username=%s", URL, endpoint, username);
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(requestURL)).
                GET().
                build();
        HttpResponse<String> responce =  client.send(request, HttpResponse.BodyHandlers.ofString());
        return GSON.fromJson(responce.body(), User.class);
    }
}
