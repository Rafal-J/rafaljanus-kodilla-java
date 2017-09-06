package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    public void share(String userName){
        System.out.println("Użytkownik " + userName + " korzysta z Facebooka.");
    }
}
