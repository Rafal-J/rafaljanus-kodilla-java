package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTest {

    @Test
    public void testUpdate() {
//Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser janKowal = new ForumUser("Jan Kowal");
        ForumUser iwonaEscobar = new ForumUser("Iwona Escobar");
        ForumUser janinaRozowa = new ForumUser("Janina Różowa");
        javaHelpForum.registerObserver(janKowal);
        javaToolsForum.registerObserver(iwonaEscobar);
        javaHelpForum.registerObserver(janinaRozowa);
        javaToolsForum.registerObserver(janinaRozowa);

//When
        javaHelpForum.addPost("Hi everyone! Could you help me, pls?");
        javaHelpForum.addPost("Better try this solution.");
        javaToolsForum.addPost("Problem with SQL query");
        javaHelpForum.addPost("Why while?");
        javaToolsForum.addPost("Authorization error");

//Then
        assertEquals(3, janKowal.getUpdateCount());
        assertEquals(2, iwonaEscobar.getUpdateCount());
        assertEquals(5, janinaRozowa.getUpdateCount());
    }
}