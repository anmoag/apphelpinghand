package com.inserta.apphelpinghand.repos;


import com.inserta.apphelpinghand.models.HistorialAccion;
import com.inserta.apphelpinghand.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "historiales")
public interface HistorialAccionRepo extends JpaRepository<HistorialAccion, Long> {
    List<HistorialAccion> findByUsuario(Usuario usuario);

}
