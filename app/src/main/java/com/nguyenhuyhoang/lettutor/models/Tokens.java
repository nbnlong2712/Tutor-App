package com.nguyenhuyhoang.lettutor.models;

public class Tokens {
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
