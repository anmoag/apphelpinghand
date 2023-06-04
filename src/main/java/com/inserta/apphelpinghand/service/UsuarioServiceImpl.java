package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.repos.UsuarioRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepo usuarioRepo;


    public UsuarioServiceImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    /**
     * Método que obtiene el email de un usuario
     *
     * @param email El correo de un Usuario
     * @return El correo de un usuario
     */
    @Override
    public Usuario obtenerPorEmail(String email) {
        return usuarioRepo.findByEmail(email);
    }

    /**
     * Obtiene la lista de usuarios por su nombre
     *
     * @param nombre nombre del usuario
     * @return lista de usuarios por nombre
     */
    @Override
    public List<Usuario> obtenerPorNombre(String nombre) {
        return usuarioRepo.findByNombre(nombre);
    }

    /**
     * Método para obtener el correo y la contraseña de un usuario
     * Útil para la validación de un usuario
     *
     * @param email,clave correo y contraseña
     * @return un usuario con correo y contraseña
     */
    @Override
    public Usuario obtenerPorEmailYClave(String email, String pass) {
        return usuarioRepo.findByEmailAndPass(email, pass);
    }

    /**
     * Método que nos devuelve un booleano y nos dice si existe o no un correo con una contraseña
     *
     * @param email,clave correo y contraseña
     * @return si existe o no (true, false)
     */
    @Override
    public boolean existeEmailYClave(String email, String pass) {
        return usuarioRepo.existsByEmailAndPass(email, pass);
    }

    /**
     * Método para obtener una lista de usuarios antes de una fecha
     *
     * @param usuarioDesde antes de la fecha
     * @return lista de usuarios antes de la fecha
     */
    @Override
    public List<Usuario> obtenerUsuariosDesde(LocalDateTime usuarioDesde) {
        return usuarioRepo.findByUsuarioDesdeBefore(usuarioDesde);
    }

    @Override
    public Usuario obtenerUsuarioPorId(long id) {
        return usuarioRepo.findById(id).orElse(null);
    }


}
