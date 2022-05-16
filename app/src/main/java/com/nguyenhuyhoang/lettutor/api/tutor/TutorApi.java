package com.nguyenhuyhoang.lettutor.api.tutor;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public interface TutorApi {
    TutorApi tutorApi = new Retrofit.Builder()
            .baseUrl("https://sandbox.api.lettutor.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TutorApi.class);


}
