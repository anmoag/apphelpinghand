package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.Mensaje;
import com.inserta.apphelpinghand.models.Usuario;

import java.util.List;

public interface MensajeService {
    Mensaje enviarMensajeAcosado(Usuario usuarioAcosado);
    double calcularDistancia(Usuario usuarioAcosado, Usuario usuarioCercano);
    public List<Usuario> obtenerUsuariosCercanos(Usuario usuarioAcosado, double distancia);
}
