package com.kodilla.good.patterns.allegro;

/**
 * Created by RJanus on 22.08.2017.
 */
public class User {
    private String userNickname;
    private String userRealname;

    public Buyer(String userNickname, String userRealname) {
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
