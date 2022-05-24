package com.nguyenhuyhoang.lettutor.models.feedback;

import com.google.gson.annotations.SerializedName;

public class TutorFeedback {
    @SerializedName("User")
    UserFeedback mUserFeedback;

    public TutorFeedback(UserFeedback userFeedback) {
        mUserFeedback = userFeedback;
    }

    public UserFeedback getUserFeedback() {
        return mUserFeedback;
    }

    public void setUserFeedback(UserFeedback userFeedback) {
        mUserFeedback = userFeedback;
    }

    @Override
    public String toString() {
        return "TutorFeedback{" +
                "mUserFeedback=" + mUserFeedback.toString() +
                '}';
    }
}
