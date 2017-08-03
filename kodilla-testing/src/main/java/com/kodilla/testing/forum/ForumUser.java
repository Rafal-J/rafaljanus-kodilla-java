package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String username;
    private String realname;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String username, String realname) {
        this.username = username;
        this.realname = realname;
    }

    public void addPost(String author, String postBody,){
        //do nothing
    }

    public void addComment(ForumPost forumPost, String author, String commentBody){
        //do nothing
    }

    public int getPostQuantity(){
        //temporarily return 100
        return 100;
    }

    public int getCommentQuantity(){
        //temporarily return 100
        return 100;
    }

    public ForumPost getPost(int postNumber){
        //temporarily return null
        return null;
    }

    public ForumComment getPost(int commentNumber){
        //temporarily return null
        return null;
    }

    public boolean removePost(ForumPost thePost){
        //temporarily return true
        return true;
    }

    public boolean removeComment(ForumComment theComment){
        //temporarily return true
        return true;
    }

    public String getUsername() {
        return username;
    }

    public String getRealname() {
        return realname;
    }
}
