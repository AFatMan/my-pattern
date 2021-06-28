package com.my.pattern.mediator;

import lombok.Data;

@Data
public class ChatUser {
    private String name;
    private int age;

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }

    public ChatUser(String name) {
        this.name = name;
    }
}
