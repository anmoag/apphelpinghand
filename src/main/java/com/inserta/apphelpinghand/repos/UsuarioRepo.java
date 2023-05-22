package com.inserta.apphelpinghand.repos;

import com.inserta.apphelping.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
