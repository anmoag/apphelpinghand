package com.inserta.apphelpinghand.repos;


import com.inserta.apphelpinghand.models.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "puntuaciones")
public interface PuntuacionRepo extends JpaRepository<Puntuacion, Long> {
}
