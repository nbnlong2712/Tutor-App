package com.nguyenhuyhoang.lettutor.models;

public class Subject {
    int id;
    String key;
    String name;

    //Constructor
    public Subject(int id, String key, String name) {
        this.id = id;
        this.key = key;
        this.name = name;
    }

    //Get and Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString
    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
