package com.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JsonPlaceholderTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create("https://jsonplaceholder.typicode.com/users")).
                GET().
                build();
        HttpResponse<String> responce =  client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Responce headers " + responce.headers());
        System.out.println("Responce body " + responce.body());
        System.out.println("Status " + responce.statusCode());
    }
}
