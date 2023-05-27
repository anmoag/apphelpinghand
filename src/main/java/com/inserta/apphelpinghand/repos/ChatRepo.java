package com.inserta.apphelpinghand.repos;


import com.inserta.apphelpinghand.models.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
@Repository
@RepositoryRestResource(path = "chats")

public interface ChatRepo extends JpaRepository<Chat, Long> {
}
