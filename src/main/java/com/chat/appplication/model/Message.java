package com.chat.appplication.model;

import lombok.Data;

@Data
public class Message {
    private String name;
    private String content;

    public Message(String name, String content) {
        this.name = name;
        this.content = content;
    }

}
