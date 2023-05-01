package org.example;

import org.example.RestByRetrofit.Model.WritePhoto;
import org.example.RestByRetrofit.RestClient;
import org.example.http.Client;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");

        Client client = new Client();
        //String response = client.get("http://example.com");
       // System.out.println(response);
        RestClient restClient = new RestClient();
        var apiResponse = restClient.getApi().getPhtotos().execute();
        WritePhoto writer= new WritePhoto();
        writer.writeImages(restClient);
        System.out.println("Image Downloaded Completed!!");


    }
}