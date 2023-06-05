package com.inserta.apphelpinghand.controllers;

import com.inserta.apphelpinghand.service.PuntuacionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/puntuaciones")
public class PuntuacionController {

    private final PuntuacionService puntuacionService;

    public PuntuacionController(PuntuacionService puntuacionService) {
        this.puntuacionService = puntuacionService;
    }

    @PostMapping("/{id}/sumar")
    public String sumarPuntuacion(@PathVariable("id") Long id, @RequestParam("puntuacion") int puntuacion) {
        puntuacionService.sumarPuntuacion(id, puntuacion);
        return "Puntuación sumada exitosamente.";
    }
}