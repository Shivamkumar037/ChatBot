package com.WhatsApp.demo.Controller;

import com.WhatsApp.demo.Dto.MessageRequest;
import com.WhatsApp.demo.Dto.MessageResponce;
import com.WhatsApp.demo.service.ChatBotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
@RequiredArgsConstructor
public class WebhookController {
    private final ChatBotService chatBotService;
    @PostMapping
    private MessageResponce sendMessage(@RequestBody MessageRequest messageRequest) {
        if(messageRequest.getMessage()==null) return new MessageResponce("Sorry I can Not understand What is the Message");
        return chatBotService.sendMessage(messageRequest);
    }
}
