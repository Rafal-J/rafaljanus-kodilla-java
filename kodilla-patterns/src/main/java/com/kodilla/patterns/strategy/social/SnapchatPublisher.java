package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    public void share(String userName){
        System.out.println("Użytkownik " + userName + " korzysta ze Snapchata.");
    }
}
