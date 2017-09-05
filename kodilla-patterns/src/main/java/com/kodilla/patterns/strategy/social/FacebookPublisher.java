package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    share(){
        System.out.println("Użytkownik " + Millenials.userName + " korzysta z Facebooka.");
    }
}
