package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 9;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Początek testów.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Testy zakończone powodzeniem");
    }

    @Before
    public void beforeTest(){
        testCounter++;
        System.out.println("Początek testu jednostkowego");
    }

    @Test
    public void testAddPost(){
        ForumUser testUser = new ForumUser("rj";"Rafał Janus");
        testUser.addPost(testUser.getUsername(),"To jest mój pierwszy komentarz. Wow!");

        Assert.assertEquals(1,testUser.getPostsQuantity());
    }

    @Test
    public void testAddComment(){
        ForumUser testUser = new ForumUser("rj";"Rafał Janus");
        ForumPost testPost = new ForumPost("To jest mój pierwszy post. Wow!","rj");
        ForumComment testComment new ForumComment(testPost,"Fajny post!","rj");

        Assert.assertEquals(1,testUser.getCommentsQuantity());
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
        ForumComment theComment = new ForumComment(thePost, "Fajny post!","rj");
        forumUser.addComment(thePost, theComment.getAuthor(),theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        //Then
        Assert.assertEquals(theComment, retrievedComment);
    }
}
