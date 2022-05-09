package com.nguyenhuyhoang.lettutor.models;

import java.util.Date;

public class Feedback {
    String id;
    String studentId; //firstId
    String studentAvatar;
    String studentName;
    String tutorId; //secondId
    int rating;
    String content;
    Date createdAt;

    //Constructor
    public Feedback(String id, String studentId, String studentAvatar, String studentName, String tutorId, int rating, String content, Date createdAt) {
        this.id = id;
        this.studentId = studentId;
        this.studentAvatar = studentAvatar;
        this.studentName = studentName;
        this.tutorId = tutorId;
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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentAvatar() {
        return studentAvatar;
    }

    public void setStudentAvatar(String studentAvatar) {
        this.studentAvatar = studentAvatar;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
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
                ", studentId='" + studentId + '\'' +
                ", studentAvatar='" + studentAvatar + '\'' +
                ", studentName='" + studentName + '\'' +
                ", tutorId='" + tutorId + '\'' +
                ", rating=" + rating +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
