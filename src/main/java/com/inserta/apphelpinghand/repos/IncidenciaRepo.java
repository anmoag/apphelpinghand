package com.inserta.apphelpinghand.repos;


import com.inserta.apphelpinghand.models.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RepositoryRestResource(path = "incidencias")

public interface IncidenciaRepo extends JpaRepository<Incidencia, Long> {
    public List<Incidencia> findByFechaHora(LocalDateTime fechaHora);
    public List<Incidencia> findByPrioridad(String prioridad);
}
