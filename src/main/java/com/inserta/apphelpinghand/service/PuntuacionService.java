package com.inserta.apphelpinghand.service;


import com.inserta.apphelpinghand.models.Usuario;

public interface PuntuacionService {
    void sumarPuntuacion(Long id, int puntuacion);
    public void agregarPuntos(Usuario usuarioAcosado, Usuario usuarioAyuda, Integer puntos);

}
