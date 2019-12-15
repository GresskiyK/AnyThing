package com.example.anything;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClass {
    private static final String BASE_URL="http://192.168.1.46:5000";
    private static Retrofit retrofit=null;

    public static Retrofit getData(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}