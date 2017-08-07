package com.kodilla.testing.forum.statistics;

/**
 * Created by RJanus on 07.08.2017.
 */
public class CalculateAdvStatistics {
    public int numberOfUsers;
    public int numberOfPosts;
    public int numberOfComments;
    public double averageUserPosts;
    public double averageUserComments;
    public double averageCommentsOnPosts;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if(statistics.usersNames().size() > 0){
            averageUserPosts = (double)statistics.postsCount()/statistics.usersNames().size();
            averageUserComments = (double)statistics.commentsCount()/statistics.usersNames().size();
        }
        else {
            averageUserPosts = 0;
            averageUserComments = 0;
        }

        if(statistics.postsCount() > 0){
            averageCommentsOnPosts = (double)statistics.commentsCount()/statistics.postsCount();
        }
        else {
            averageCommentsOnPosts = 0;
        }

    }

    public void showStatistics(){
        System.out.println("Liczba użytkowników: " + numberOfUsers);
        System.out.println("Liczba postów:       " + numberOfPosts);
        System.out.println("Liczba komentarzy:   " + numberOfComments);
        System.out.println("Srednia liczba postów na użytkownika:     " + averageUserPosts);
        System.out.println("Srednia liczba komentarzy na użytkownika: " + averageUserComments);
        System.out.println("Srednia liczba komentarzy na post:        " + averageCommentsOnPosts);
    }
}
