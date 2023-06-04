package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.HistorialAccion;
import com.inserta.apphelpinghand.models.Usuario;

import java.util.List;

public interface HistorialAccionService {
    public HistorialAccion agregarAccion(Usuario usuario, String accion);
    public List<HistorialAccion> obtenerHistorialPorUsuario(Usuario usuario);
    public void eliminarHistorialPorUsuario(Usuario usuario);

}
