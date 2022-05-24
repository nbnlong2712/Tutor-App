package com.nguyenhuyhoang.lettutor.models.feedback;

import com.nguyenhuyhoang.lettutor.models.User;

import java.util.Date;

public class Feedback {
    String id;
    FirstInfo firstInfo; //student
    int rating;
    String content;
    Date createdAt;

    //Constructor
    public Feedback(String id, FirstInfo firstInfo, int rating, String content, Date createdAt) {
        this.id = id;
        this.firstInfo = firstInfo;
        this.rating = rating;
        this.content = content;
        this.createdAt = createdAt;
    }

    //get set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FirstInfo getFirstInfo() {
        return firstInfo;
    }

    public void setFirstInfo(FirstInfo firstInfo) {
        this.firstInfo = firstInfo;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    //toString

    @Override
    public String toString() {
        return "Feedback{" +
                "id='" + id + '\'' +
                ", firstInfo=" + firstInfo.toString() +
                ", rating=" + rating +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
