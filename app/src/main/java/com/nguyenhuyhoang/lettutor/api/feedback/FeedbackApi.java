package com.nguyenhuyhoang.lettutor.api.feedback;

import com.nguyenhuyhoang.lettutor.models.feedback.TutorFeedback;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;

public interface FeedbackApi {
    FeedbackApi feedbackApi = new Retrofit.Builder()
            .baseUrl("https://sandbox.api.lettutor.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FeedbackApi.class);

    @GET("/tutor/{tutorId}")
    Call<TutorFeedback> getFeedback(@HeaderMap Map<String, String> headers, @Path("tutorId") String tutorId);
}
