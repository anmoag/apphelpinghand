package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.Usuario;

import java.time.LocalDateTime;
import java.util.List;

public interface UsuarioService {
    public Usuario obtenerPorEmail(String email);

    public List<Usuario> obtenerPorNombre(String nombre);

    public Usuario obtenerPorEmailYClave(String email, String pass);

    public boolean existeEmailYClave(String email, String pass);

    public List<Usuario> obtenerUsuarioDesde(LocalDateTime usuarioDesde);

    List<Usuario> obtenerUsuariosDesde(LocalDateTime usuarioDesde);
}
