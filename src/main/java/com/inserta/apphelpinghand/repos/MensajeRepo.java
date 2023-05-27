package com.inserta.apphelpinghand.repos;


import com.inserta.apphelpinghand.models.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "mensajes")
public interface MensajeRepo extends JpaRepository<Mensaje, Long> {
}
