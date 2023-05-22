package com.inserta.apphelpinghand.repos;

import com.inserta.apphelping.models.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepo extends JpaRepository<Mensaje, Long> {
}
