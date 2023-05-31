package com.inserta.apphelpinghand.repos;


import com.inserta.apphelpinghand.models.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RepositoryRestResource(path = "chats")

public interface ChatRepo extends JpaRepository<Chat, Long> {
    public List<Chat> findAllByFechaEnvio(LocalDateTime fechaHora);
    public Boolean deleteChatById(int id);
}
