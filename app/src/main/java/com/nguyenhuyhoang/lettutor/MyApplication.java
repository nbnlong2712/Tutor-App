package com.nguyenhuyhoang.lettutor;

import android.app.Application;
import android.content.Context;

import com.nguyenhuyhoang.lettutor.models.User;

public class MyApplication extends Application {
    private static Context context;
    private User mainUser;

    @Override
    public void onCreate() {
        super.onCreate();
        MyApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MyApplication.context;
    }

    public User getMainUser() {
        return mainUser;
    }

    public void setMainUser(User user) {
        mainUser = user;
    }
}
