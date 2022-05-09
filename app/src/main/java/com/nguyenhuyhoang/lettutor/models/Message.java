package com.nguyenhuyhoang.lettutor.models;

public class Message {
    int statusCode;
    String message;

    //Constructor
    public Message(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    //get set
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //toString
    @Override
    public String toString() {
        return "Message{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                '}';
    }
}
