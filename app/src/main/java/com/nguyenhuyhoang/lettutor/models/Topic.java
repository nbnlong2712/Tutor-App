package com.nguyenhuyhoang.lettutor.models;

public class Topic {
    String id;
    String courseId;
    int orderCourse;
    String name;
    String nameFile;
    String description;

    //Construct
    public Topic(String id, String courseId, int orderCourse, String name, String nameFile, String description) {
        this.id = id;
        this.courseId = courseId;
        this.orderCourse = orderCourse;
        this.name = name;
        this.nameFile = nameFile;
        this.description = description;
    }

    //Get and set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getOrderCourse() {
        return orderCourse;
    }

    public void setOrderCourse(int orderCourse) {
        this.orderCourse = orderCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //toString
    @Override
    public String toString() {
        return "Topic{" +
                "id='" + id + '\'' +
                ", courseId='" + courseId + '\'' +
                ", orderCourse=" + orderCourse +
                ", name='" + name + '\'' +
                ", nameFile='" + nameFile + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
