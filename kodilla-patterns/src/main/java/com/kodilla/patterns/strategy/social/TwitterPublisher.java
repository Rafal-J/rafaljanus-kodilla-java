package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    public void share(String userName){
    System.out.println("Użytkownik " + userName + " korzysta z Twittera.");
}
}
