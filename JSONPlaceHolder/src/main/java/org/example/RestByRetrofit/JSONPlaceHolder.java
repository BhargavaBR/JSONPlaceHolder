package org.example.RestByRetrofit;

import org.example.RestByRetrofit.Model.Photo;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface JSONPlaceHolder {
    @GET("/photos")
    Call<List<Photo>> getPhtotos();
}
