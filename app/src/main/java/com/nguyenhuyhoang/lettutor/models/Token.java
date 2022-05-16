package com.nguyenhuyhoang.lettutor.models;


public class Token {
    Tokens tokens;

    //Constructor
    public Token(Tokens tokens) {
        this.tokens = tokens;
    }

    //Get and Set
    public Tokens getTokens() {
        return tokens;
    }

    public void setTokens(Tokens tokens) {
        this.tokens = tokens;
    }

    //toString
    @Override
    public String toString() {
        return "Token{" +
                "tokens=" + tokens +
                '}';
    }
}