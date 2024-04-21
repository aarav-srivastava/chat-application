package com.chat.appplication.Controller;

import com.chat.appplication.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    /**
     * @param message
     * takes a message and returns it to everyone in the room.
     * @return Message
     */
    @MessageMapping("/message")
    @SendTo("/topic/return-to") // message will be sent to all the people who are subscribed to "/topic/return-to" url.
    public Message getContent(@RequestBody Message message){
        return message;
    }
}
