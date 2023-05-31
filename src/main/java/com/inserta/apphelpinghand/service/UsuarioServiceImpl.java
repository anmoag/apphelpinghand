package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.repos.UsuarioRepo;
import com.inserta.apphelpinghand.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepo usuarioRepo;

    public UsuarioServiceImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public Usuario obtenerPorEmail(String email) {
        return usuarioRepo.findByEmail(email);
    }

    @Override
    public List<Usuario> obtenerPorNombre(String nombre) {
        return usuarioRepo.findByNombre(nombre);
    }

    @Override
    public Usuario obtenerPorEmailAndPass(String email, String pass) {
        return usuarioRepo.findByEmailAndPass(email, pass);
    }

    @Override
    public boolean existeEmailAndPass(String email, String pass) {
        return false;
    }

    @Override
    public List<Usuario> obtenerUsuarioDesde(LocalDateTime usuarioDesde) {
        return usuarioRepo.findByUsuarioDesdeBefore(usuarioDesde);
    }
}
