package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.Puntuacion;
import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.repos.PuntuacionRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PuntuacionServiceImpl implements PuntuacionService{

    private final PuntuacionRepo puntuacionRepo;

    public PuntuacionServiceImpl(PuntuacionRepo puntuacionRepo) {
        this.puntuacionRepo = puntuacionRepo;
    }

    @Override
    public void sumarPuntuacion(Long id, int puntuacion) {
        // Buscar la puntuación existente por su ID
        Optional<Puntuacion> puntuacionExistenteOptional = puntuacionRepo.findById(id);

        // Verificar si la puntuación existente se encontró en la base de datos
        if (puntuacionExistenteOptional.isPresent()) {
            // Obtener la puntuación existente de la opción envuelta en Optional
            Puntuacion puntuacionExistente = puntuacionExistenteOptional.get();

            // Calcular la puntuación actualizada sumando la puntuación existente y la puntuación proporcionada
            int puntuacionActualizada = puntuacionExistente.getPuntuacion() + puntuacion;

            // Establecer la puntuación actualizada en la puntuación existente
            puntuacionExistente.setPuntuacion(puntuacionActualizada);

            // Guardar la puntuación existente actualizada en la base de datos
            puntuacionRepo.save(puntuacionExistente);
        }
    }


}
