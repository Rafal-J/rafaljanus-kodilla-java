package com.kodilla.patterns.strategy.social;

public class User {
    public final String userName;
    protected SocialPublisher socialPublisher;
    public User(String userName){
        this.userName = userName;
    }

    public void sharePost(){
        socialPublisher.share(userName);
    }

    public String getUserName() {
        return userName;
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
