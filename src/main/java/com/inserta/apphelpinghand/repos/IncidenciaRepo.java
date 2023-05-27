package com.inserta.apphelpinghand.repos;


import com.inserta.apphelpinghand.models.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "incidencias")

public interface IncidenciaRepo extends JpaRepository<Incidencia, Long> {
}
