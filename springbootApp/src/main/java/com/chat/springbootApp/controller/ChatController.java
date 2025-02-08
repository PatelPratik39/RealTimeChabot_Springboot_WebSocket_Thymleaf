package com.chat.springbootApp.controller;

import com.chat.springbootApp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    // /app/SendMessage

    @MessageMapping("/app/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message){
        System.out.println("Received Message: " + message);
        return message;
    }
    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
}
