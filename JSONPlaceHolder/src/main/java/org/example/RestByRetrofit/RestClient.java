package org.example.RestByRetrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    JSONPlaceHolder api;
    public  RestClient() {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://jsonplaceholder.typicode.com").
                addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient()).build();

        api = retrofit.create(JSONPlaceHolder.class);

    }
    public JSONPlaceHolder getApi() {
        return api;
    }
}
