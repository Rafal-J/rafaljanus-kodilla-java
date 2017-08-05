package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 9;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Początek testów.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Testy zakończone powodzeniem");
    }

    @Before
    public void beforeTest() {
        testCounter++;
        System.out.println("Początek testu jednostkowego");
    }

    @Test
    public void testAddPost() {
        ForumUser testUser = new ForumUser("rj", "Rafał Janus");

        testUser.addPost(testUser.getUsername(), "To jest mój pierwszy komentarz. Wow!");

        Assert.assertEquals(1, testUser.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        ForumUser testUser = new ForumUser("rj", "Rafał Janus");
        ForumPost testPost = new ForumPost("To jest mój pierwszy post. Wow!", "rj");
        testUser.addComment(testPost, "rj", "Fajny post");

        Assert.assertEquals(1, testUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        ForumUser forumUser = new ForumUser("rj", "Rafał Janus");
        ForumPost thePost = new ForumPost("To mój pierwszy post. Wow!", "rj");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("rj", "Rafał Janus");
        ForumPost thePost = new ForumPost("To mój pierwszy post. Wow!", "rj");
        ForumComment theComment = new ForumComment(thePost, "rj", "Fajny post!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        //Then
        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("rj", "Rafał Janus");
        ForumPost thePost = new ForumPost("To mój pierwszy post. Wow!", "rj");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("rj", "Rafał Janus");
        ForumPost thePost = new ForumPost("To mój pierwszy post. Wow!", "rj");
        ForumComment theComment = new ForumComment(thePost, "rj", "Fajny post");

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("rj", "Rafał Janus");
        ForumPost thePost = new ForumPost("To mój pierwszy post. Wow!", "rj");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("rj", "Rafał Janus");
        ForumPost thePost = new ForumPost("To mój pierwszy post. Wow!", "rj");
        ForumComment theComment = new ForumComment(thePost, "rj", "Fajny post!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}