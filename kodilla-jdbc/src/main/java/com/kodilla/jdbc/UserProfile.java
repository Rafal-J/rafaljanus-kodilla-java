package com.kodilla.jdbc;

public class UserProfile {
    public String firstName;
    public String lastName;
    public int amountOfPosts;

    public UserProfile(String firstName, String lastName, int amountOfPosts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfPosts = amountOfPosts;
    }

    public int getId() {
        return amountOfPosts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
