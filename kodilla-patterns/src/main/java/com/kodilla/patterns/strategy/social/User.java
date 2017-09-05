package com.kodilla.patterns.strategy.social;

public class User {
    public String userName;
    protected SocialPublisher socialPublisher;
    public User(String userName){
        this.userName = userName;
    }
}
