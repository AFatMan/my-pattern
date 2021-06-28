package com.my.pattern.mediator;

import java.util.Date;

public class ChatRoom {

    public static void showMessage(ChatUser user, String message) {
        System.out.println(new Date()+"--"+user.getName()+":"+message);
    }
}
