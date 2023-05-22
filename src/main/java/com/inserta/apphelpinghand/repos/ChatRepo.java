package com.inserta.apphelpinghand.repos;

import com.inserta.apphelping.models.Chat;
import com.inserta.apphelping.models.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepo extends JpaRepository<Chat, Long> {
}
