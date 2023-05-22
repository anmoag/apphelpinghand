package com.inserta.apphelpinghand.repos;

import com.inserta.apphelping.models.HistorialAccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialAccionRepo extends JpaRepository<HistorialAccion, Long> {
}
