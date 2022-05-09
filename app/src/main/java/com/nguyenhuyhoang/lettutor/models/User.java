package com.nguyenhuyhoang.lettutor.models;

import java.util.Date;
import java.util.List;

public class User {
    String id;
    String email;
    String name;
    String avatar;
    String country;
    String phone;
    String language;
    Date birthday;
    boolean isActivated;
    String level;
    List<Subject> learnTopics;
    List<Subject> testPreparations;
    String tutorInfoId;

    //-----Constructor-----
    public User(String id, String email, String name, String avatar, String country, String phone, String language, Date birthday, boolean isActivated, String level, List<Subject> learnTopics, List<Subject> testPreparations, String tutorInfoId) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.avatar = avatar;
        this.country = country;
        this.phone = phone;
        this.language = language;
        this.birthday = birthday;
        this.isActivated = isActivated;
        this.level = level;
        this.learnTopics = learnTopics;
        this.testPreparations = testPreparations;
        this.tutorInfoId = tutorInfoId;
    }


    //-----toString-----
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", language='" + language + '\'' +
                ", birthday=" + birthday +
                ", isActivated=" + isActivated +
                ", level='" + level + '\'' +
                ", learnTopics=" + learnTopics +
                ", testPreparations=" + testPreparations +
                ", tutorInfoId='" + tutorInfoId + '\'' +
                '}';
    }

    //-----Getter and Setter-----
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Subject> getLearnTopics() {
        return learnTopics;
    }

    public void setLearnTopics(List<Subject> learnTopics) {
        this.learnTopics = learnTopics;
    }

    public List<Subject> getTestPreparations() {
        return testPreparations;
    }

    public void setTestPreparations(List<Subject> testPreparations) {
        this.testPreparations = testPreparations;
    }

    public String getTutorInfoId() {
        return tutorInfoId;
    }

    public void setTutorInfoId(String tutorInfoId) {
        this.tutorInfoId = tutorInfoId;
    }
}
