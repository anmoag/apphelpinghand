package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.Incidencia;
import com.inserta.apphelpinghand.repos.IncidenciaRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class IncidenciaServiceImpl implements IncidenciaService{
    private final IncidenciaRepo incidenciaRepo;

    public IncidenciaServiceImpl(IncidenciaRepo incidenciaRepo) {
        this.incidenciaRepo = incidenciaRepo;
    }

    /**
     * Método que no da una lista de incidencias por fecha
     *
     * @param fechaHora de la incidencia
     * @return fechaHora de la incidencia
     */
    @Override
    public List<Incidencia> obtenerIncidenciaFechaHora(LocalDateTime fechaHora) {
        return incidenciaRepo.findByFechaHora(fechaHora);
    }
    /**
     * Método que nos da una lista de incidencias por prioridad
     *
     * @param prioridad de la incidencia
     * @return prioridad de la incidencia
     */
    @Override
    public List<Incidencia> obtenerPrioridad(String prioridad) {
        return incidenciaRepo.findByPrioridad(prioridad);
    }
}
