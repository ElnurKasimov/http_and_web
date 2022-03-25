package com.http;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class SiteParsingDemo {
    public static void main(String[] args) throws IOException {
        String url = "https://habr.com/ru/all/";
        Document document = Jsoup.connect(url).get();
        Element body = document.body();
        System.out.println(body.text());
        System.out.println(body.html());
        //String articleName = article.getElementsByTag("h2").first().text();

    }
}
