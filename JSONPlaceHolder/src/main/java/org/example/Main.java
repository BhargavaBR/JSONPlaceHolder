package org.example;

import org.example.http.Client;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Client client = new Client();
        String response = client.get("http://example.com");
        System.out.println(response);
    }
}