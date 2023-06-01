package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.Incidencia;

import java.time.LocalDateTime;
import java.util.List;

public interface IncidenciaService {
    public List<Incidencia> obtenerIncidenciaFechaHora(LocalDateTime fechaHora);
    public List<Incidencia> obtenerPrioridad(String prioridad);
}
