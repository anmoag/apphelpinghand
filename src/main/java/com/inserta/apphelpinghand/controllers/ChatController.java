package com.inserta.apphelpinghand.controllers;

import com.inserta.apphelpinghand.service.ChatService;
import com.inserta.apphelpinghand.models.Chat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/chats")
public class ChatController {
    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }
    @GetMapping("/fecha/{fecha}")
    public List<Chat> buscarFechaChat(@PathVariable String fecha){
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime fechaHora = LocalDateTime.parse(fecha, formateador);

        return chatService.buscarFecha(fechaHora);

    }

}
