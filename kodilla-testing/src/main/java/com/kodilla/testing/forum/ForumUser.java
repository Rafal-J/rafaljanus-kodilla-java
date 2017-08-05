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

    public void addPost(String author, String postBody){
        ForumPost newPost = new ForumPost(postBody,author);
        posts.add(newPost);
    }

    public void addComment(ForumPost forumPost, String author, String commentBody){
        ForumComment newComment = new ForumComment(forumPost,commentBody,author);
        comments.add(newComment);
    }

    public int getPostsQuantity(){
       return posts.size();
    }

    public int getCommentsQuantity(){
       return comments.size();
    }

    public ForumPost getPost(int postNumber){
        ForumPost thePost = null;
        if(postNumber >= 0 && postNumber < posts.size() && posts.size() > 0){
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    public ForumComment getComment(int commentNumber){
        ForumComment theComment = null;
        if(commentNumber >= 0 && commentNumber < comments.size() && comments.size() > 0){
            theComment = comments.get(commentNumber);//temporarily return null
        }
        return theComment;
    }

    public boolean removePost(ForumPost thePost){
        boolean result = false;
        if(posts.contains(thePost)){
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment){
        boolean result = false;
        if(comments.contains(theComment)){
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getUsername() {
        return username;
    }

    public String getRealname() {
        return realname;
    }
}
