package com.inserta.apphelpinghand.repos;

import com.inserta.apphelping.models.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidenciaRepo extends JpaRepository<Incidencia, Long> {
}
