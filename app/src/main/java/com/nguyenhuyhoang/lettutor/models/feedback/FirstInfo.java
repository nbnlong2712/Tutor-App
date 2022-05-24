package com.nguyenhuyhoang.lettutor.models.feedback;

import com.nguyenhuyhoang.lettutor.models.Subject;

import java.util.Date;
import java.util.List;

public class FirstInfo {
    String id;
    String name;
    String avatar;

    public FirstInfo(String id, String name, String avatar) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "FirstInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
