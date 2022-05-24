package com.nguyenhuyhoang.lettutor.api.tutor;

import com.nguyenhuyhoang.lettutor.models.tutor.Tutor;
import com.nguyenhuyhoang.lettutor.models.tutor.Tutors;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;

public interface TutorApi {
    TutorApi tutorApi = new Retrofit.Builder()
            .baseUrl("https://sandbox.api.lettutor.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TutorApi.class);

    @GET("/tutor/more")
    Call<Tutors> getListTutors(@HeaderMap Map<String, String> headers);

    @GET("/tutor/{tutorId}")
    Call<Tutor> getTutorInfo(@HeaderMap Map<String, String> headers, @Path("tutorId") String tutorId);
}
