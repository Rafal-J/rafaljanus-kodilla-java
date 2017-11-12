package com.kodilla.patterns2.observer.forum;

public class ForumUser implements Observer {
    private final String username;
    private int updateCount;

    public ForumUser(String username) {
        this.username = username;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(username + ": Nowa wiadomość w temacie " + forumTopic.getName() + "\n" +
                " (razem: " + forumTopic.getMessages().size() + " wiadomości)");
        updateCount++;
    }

    public String getUserName() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}