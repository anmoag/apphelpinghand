package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.HistorialAccion;
import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.repos.HistorialAccionRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class HistorialAccionServiceImpl implements HistorialAccionService{

    private final HistorialAccionRepo historialAccionRepo;

    public HistorialAccionServiceImpl(HistorialAccionRepo historialAccionRepo) {
        this.historialAccionRepo = historialAccionRepo;
    }

    public HistorialAccion agregarAccion(Usuario usuario, String accion) {
        HistorialAccion historialAccion = new HistorialAccion();
        historialAccion.setUsuario(usuario);
        historialAccion.setAccion(accion);
        historialAccion.setFecha(LocalDateTime.now());
        return historialAccionRepo.save(historialAccion);
    }

    public List<HistorialAccion> obtenerHistorialPorUsuario(Usuario usuario) {
        return historialAccionRepo.findByUsuario(usuario);
    }

    public void eliminarHistorialPorUsuario(Usuario usuario) {
        List<HistorialAccion> historial = historialAccionRepo.findByUsuario(usuario);
        historialAccionRepo.deleteAll(historial);
    }
}
