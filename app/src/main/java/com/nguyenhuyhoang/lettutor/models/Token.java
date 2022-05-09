package com.nguyenhuyhoang.lettutor.models;


class Token {
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

class Tokens {
    Access access;
    Access refresh;

    //Constructor
    public Tokens(Access access, Access refresh) {
        this.access = access;
        this.refresh = refresh;
    }

    //Get and Set
    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public Access getRefresh() {
        return refresh;
    }

    public void setRefresh(Access refresh) {
        this.refresh = refresh;
    }

    //toString
    @Override
    public String toString() {
        return "Tokens{" +
                "access=" + access +
                ", refresh=" + refresh +
                '}';
    }
}

class Access {
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