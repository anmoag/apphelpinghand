package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.Usuario;

import java.time.LocalDateTime;
import java.util.List;

public interface UsuarioService {
    public Usuario obtenerPorEmail(String email);

    public List<Usuario> obtenerPorNombre(String nombre);

    public Usuario obtenerPorEmailYClave(String email, String pass);

    public boolean existeEmailYClave(String email, String pass);

    public List<Usuario> obtenerUsuariosDesde(LocalDateTime usuarioDesde);
    public Usuario obtenerUsuarioPorId(long id);

    public List<Usuario> obtenerTodosLosUsuarios();

    public void guardarUsuario(Usuario usuarioAyuda);
}
