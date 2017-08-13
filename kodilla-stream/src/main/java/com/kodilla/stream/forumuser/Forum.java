package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1, "Rafał Janus", 'M',2000,12,31,5));
        userList.add(new ForumUser(1, "Wanda Janus", 'F',2000,12,31,0));
        userList.add(new ForumUser(1, "Piotr Janus", 'M',2000,12,31,0));
        userList.add(new ForumUser(1, "Basia Janus", 'F',2000,12,31,5));
        userList.add(new ForumUser(1, "Ela Janus", 'F',1990,12,31,0));
        userList.add(new ForumUser(1, "Zofia Janus", 'F',2000,12,31,5));
        userList.add(new ForumUser(1, "Bartek Janus", 'M',2000,12,31,0));
        userList.add(new ForumUser(1, "Ola Janus", 'F',2000,12,31,5));
        userList.add(new ForumUser(1, "Krzysztof Janus", 'M',2000,12,31,0));
        userList.add(new ForumUser(1, "Wojciech Janus", 'M',2000,12,31,5));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
