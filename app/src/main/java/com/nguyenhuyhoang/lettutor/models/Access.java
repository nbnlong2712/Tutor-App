package com.nguyenhuyhoang.lettutor.models;


public class Access {
    String token;

    //Constructor
    public Access(String token) {
        this.token = token;
    }

    //Get and Set
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    //toString
    @Override
    public String toString() {
        return "Access{" +
                "token='" + token + '\'' +
                '}';
    }
}