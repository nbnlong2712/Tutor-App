package com.nguyenhuyhoang.lettutor.models;

import java.util.List;

public class Course {
    String id;
    String name;
    String description;
    String imageUrl;
    String level;
    String reason;
    String purpose;
    String category;
    int topicsLength;
    List<Topic> topics;

    //Constructor
    public Course(String id, String name, String description, String imageUrl, String level, String reason, String purpose, String category, int topicsLength, List<Topic> topics) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.level = level;
        this.reason = reason;
        this.purpose = purpose;
        this.category = category;
        this.topicsLength = topicsLength;
        this.topics = topics;
    }

    //get set
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTopicsLength() {
        return topicsLength;
    }

    public void setTopicsLength(int topicsLength) {
        this.topicsLength = topicsLength;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    //toString

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", level='" + level + '\'' +
                ", reason='" + reason + '\'' +
                ", purpose='" + purpose + '\'' +
                ", category='" + category + '\'' +
                ", topicsLength=" + topicsLength +
                ", topics=" + topics +
                '}';
    }
}

