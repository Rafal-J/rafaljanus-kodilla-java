package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args)  {
        User user = null;

        MessageSender messageSender = new MessageSender();
        try{
            messageSender.sendMessageTo(user, "Hello!");
        }catch(MessageNotSentException i){
            System.out.println("Program zwrócił wyjątek, ale nadala działa.");
        }

        System.out.println("Przechodzę do kolejnych zadań!");

    }
}