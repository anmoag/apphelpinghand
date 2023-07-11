package com.inserta.apphelpinghand.repos;


import com.inserta.apphelpinghand.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDateTime;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@Repository
@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

    public Usuario findByEmail(String email);

    public List<Usuario> findByNombre(String nombre);

    public Usuario findByEmailAndPass(String email, String pass);

    public boolean existsByEmailAndPass(String email, String pass);

    public List<Usuario> findByUsuarioDesdeBefore(LocalDateTime usuarioDesde);


}
