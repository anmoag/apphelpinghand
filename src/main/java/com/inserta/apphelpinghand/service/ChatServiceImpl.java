package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.Chat;
import com.inserta.apphelpinghand.repos.ChatRepo;
import com.inserta.apphelpinghand.service.ChatService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class ChatServiceImpl implements ChatService {
    private  final ChatRepo chatRepo;

    public ChatServiceImpl(ChatRepo chatRepo) {
        this.chatRepo = chatRepo;
    }
/**
 * Busca chats por fecha.
 *
 * @param fechaHora la fecha en formato de cadena (yyyy-MM-dd'T'HH:mm:ss)
 * @return una lista de objetos Chat que coinciden con la fecha especificada
*/
    @Override
    public List<Chat> buscarFecha(LocalDateTime fechaHora) {
        return chatRepo.findAllByFechaEnvio(fechaHora);
    }
}
