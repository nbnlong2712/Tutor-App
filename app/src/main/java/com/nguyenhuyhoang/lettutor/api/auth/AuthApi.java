package com.nguyenhuyhoang.lettutor.api.auth;

import com.nguyenhuyhoang.lettutor.api.tutor.TutorApi;
import com.nguyenhuyhoang.lettutor.models.Message;
import com.nguyenhuyhoang.lettutor.models.Token;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AuthApi {
    AuthApi authApi = new Retrofit.Builder()
            .baseUrl("https://sandbox.api.lettutor.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AuthApi.class);

    @POST("/auth/login")
    Call<Token> login(@HeaderMap Map<String, String> headers, @Body Map<String, String> body);

    @POST("/auth/register")
    Call<Message> register(@HeaderMap Map<String, String> headers, @Body String email, @Body String password);

    @POST("auth/change-password")
    Call<Message> changePassword(@HeaderMap Map<String, String> headers, @Body String password, @Body String newPassword);


}
