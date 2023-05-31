package com.inserta.apphelpinghand.services;

import com.inserta.apphelpinghand.models.Usuario;

import java.time.LocalDateTime;
import java.util.List;

public interface UsuarioService {
    public Usuario obtenerPorEmail(String email);

    public List<Usuario> obtenerPorNombre(String nombre);

    public Usuario obtenerPorEmailAndPass(String email, String pass);

    public boolean existeEmailAndPass(String email, String pass);

    public List<Usuario> obtenerUsuarioDesde(LocalDateTime usuarioDesde);
}
