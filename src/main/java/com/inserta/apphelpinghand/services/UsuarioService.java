package com.inserta.apphelpinghand.services;

import com.inserta.apphelpinghand.models.Usuario;

import java.time.LocalDateTime;
import java.util.List;

public interface UsuarioService {
    public Usuario findByEmailAndPass(String email, String pass);

    public List<Usuario> findByUsuarioDesde(LocalDateTime usuarioDesde);

    public List<Usuario> findByLongitudAndLatitud(Double longitud, Double latitud, Double distancia);

    public Usuario findById(int id);
}
