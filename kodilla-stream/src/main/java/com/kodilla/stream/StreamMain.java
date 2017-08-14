package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum newForum = new Forum();
        Map<Integer,ForumUser> userMap = newForum.getUserList().stream()
                .filter(user -> user.getUserSex() == 'F')
                .filter(user -> user.getUserBirthday().getYear() > 1997)
                .filter(user -> user.getNumberOfPosts() == 0)
                .collect(Collectors.toMap(ForumUser::getUserID,user -> user));

        System.out.println(userMap.size());

        userMap.entrySet().stream()
                .map(user -> user.getKey() + " -- " + user.getValue())
                .forEach(user -> System.out.println(user));

        BigDecimal sandQuantity = new BigDecimal("12345678901234567890");
        sandQuantity.setScale(5,3);
        System.out.println(sandQuantity.scale());
        //for(BigDecimal i = sandQuantity; i < BigDecimal.ONE; i.subtract(1))

    }
}