package com.inserta.apphelpinghand.repos;


import com.inserta.apphelpinghand.models.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(path = "puntuaciones")
public interface PuntuacionRepo extends JpaRepository<Puntuacion, Long> {
}
