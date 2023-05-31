package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.Chat;

import java.time.LocalDateTime;
import java.util.List;

public interface ChatService {
    public List<Chat> buscarFecha(LocalDateTime fechaHora);

}
