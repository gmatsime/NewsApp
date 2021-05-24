package com.example.newsapp;

import com.example.newsapp.model.Popular;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface   Interface {
    @GET("viewed")
    Call<Popular> getMostPopular (
        @Query("period")int period,
        @Query("apikey") String apikey);

}
