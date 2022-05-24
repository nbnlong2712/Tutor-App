package com.nguyenhuyhoang.lettutor.models.feedback;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserFeedback {
    @SerializedName("feedbacks")
    List<Feedback> feedbacks;

    public UserFeedback(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    @Override
    public String toString() {
        return "UserFeedback{" +
                "feedbacks=" + feedbacks +
                '}';
    }
}
