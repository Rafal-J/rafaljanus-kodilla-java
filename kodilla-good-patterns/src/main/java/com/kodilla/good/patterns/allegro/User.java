package com.kodilla.good.patterns.allegro;

public class User {
    private String userNickname;
    private String userRealname;

    public User(String userNickname, String userRealname) {
        this.userNickname = userNickname;
        this.userRealname = userRealname;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public String getUserRealname() {
        return userRealname;
    }
}
