package com.inserta.apphelpinghand.repos;

import com.inserta.apphelping.models.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntuacionRepo extends JpaRepository<Puntuacion, Long> {
}
