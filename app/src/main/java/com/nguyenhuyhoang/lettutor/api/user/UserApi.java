package com.nguyenhuyhoang.lettutor.api.user;

import com.nguyenhuyhoang.lettutor.models.User;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;

public interface UserApi {

    UserApi userApi = new Retrofit.Builder()
            .baseUrl("https://sandbox.api.lettutor.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserApi.class);

    @GET("/user/info")
    Call<User> getUserInfo(@HeaderMap Map<String, String> headers);
}
