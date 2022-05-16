package com.nguyenhuyhoang.lettutor.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.nguyenhuyhoang.lettutor.MyApplication;

import java.util.HashMap;
import java.util.Map;

public class Header {
    public static Map<String, String> headers() {
        SharedPreferences prefs = MyApplication.getAppContext().getSharedPreferences("Auth", Context.MODE_PRIVATE);
        String token = prefs.getString("access", "");
        Map<String, String> header = new HashMap<String, String>() {{
            put("Content-Type", "application/json");
            put("Authorization", " Bearer " + token);
        }};
        return header;
    }

    public static Map<String, String> header = new HashMap<String, String>() {{
        put("Content-Type", "application/json");
    }};

}
