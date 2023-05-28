package com.inserta.apphelpinghand.services;

import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.repos.UsuarioRepo;

import java.time.LocalDateTime;
import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepo usuarioRepo;

    public UsuarioServiceImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public Usuario findByEmailAndPass(String email, String pass) {
        return usuarioRepo.findByEmailAndPass(email, pass);
    }

    @Override
    public List<Usuario> findByUsuarioDesde(LocalDateTime usuarioDesde) {
        return usuarioRepo.findByUsuarioDesde(usuarioDesde);
    }

    @Override
    public List<Usuario> findByLongitudAndLatitud(Double longitud, Double latitud, Double distancia) {
        return null;
    }

    @Override
    public Usuario findById(int id) {
        return usuarioRepo.findById(id);
    }

}
