package com.nguyenhuyhoang.lettutor.models.tutor;

import com.google.gson.annotations.SerializedName;
import com.nguyenhuyhoang.lettutor.models.User;

import java.util.List;

public class Tutor {
    String id;
    String userId;

    String email;
    String name;
    String avatar;
    String country;
    String phone;
    String level;
    String video;
    String bio;
    String education;
    String experience;
    String profession;
    String targetStudent;
    String interests;
    String languages;
    String specialties;
    int price;
    @SerializedName("avgRating")
    double avgRating;
    boolean isFavorite;


    @SerializedName("User")
    User user;


    //Constructor

    public Tutor(String id, String userId, String email, String name, String avatar, String country, String phone, String level, String video, String bio, String education, String experience, String profession, String targetStudent, String interests, String languages, String specialties, int price, double avgRating, boolean isFavorite, User user) {
        this.id = id;
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.avatar = avatar;
        this.country = country;
        this.phone = phone;
        this.level = level;
        this.video = video;
        this.bio = bio;
        this.education = education;
        this.experience = experience;
        this.profession = profession;
        this.targetStudent = targetStudent;
        this.interests = interests;
        this.languages = languages;
        this.specialties = specialties;
        this.price = price;
        this.avgRating = avgRating;
        this.isFavorite = isFavorite;
        this.user = user;
    }

    //Getter and Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTargetStudent() {
        return targetStudent;
    }

    public void setTargetStudent(String targetStudent) {
        this.targetStudent = targetStudent;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }


    //toString

    @Override
    public String toString() {
        return "Tutor{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", level='" + level + '\'' +
                ", video='" + video + '\'' +
                ", bio='" + bio + '\'' +
                ", education='" + education + '\'' +
                ", experience='" + experience + '\'' +
                ", profession='" + profession + '\'' +
                ", targetStudent='" + targetStudent + '\'' +
                ", interests='" + interests + '\'' +
                ", languages='" + languages + '\'' +
                ", specialties='" + specialties + '\'' +
                ", price=" + price +
                ", avgRating=" + avgRating +
                ", isFavorite=" + isFavorite +
                ", user=" + user.toString() +
                '}';
    }
}
