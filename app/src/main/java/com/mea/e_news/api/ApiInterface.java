package com.mea.e_news.api;

import com.mea.e_news.models.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET ("top-headlines")
        Call <News> getNews(

            @Query("country") String country ,
            @Query("apikey")  String apikey
    );
}
