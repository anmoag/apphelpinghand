package com.inserta.apphelpinghand.repos;

import com.inserta.apphelpinghand.models.Palabra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "palabras")
public interface PalabrasRepo extends JpaRepository<Palabra, Integer> {
}
