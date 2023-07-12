package com.inserta.apphelpinghand.controllers;

import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.service.PuntuacionService;
import com.inserta.apphelpinghand.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/puntuaciones")
public class PuntuacionController {

    private final PuntuacionService puntuacionService;
    private final UsuarioService usuarioService;

    public PuntuacionController(PuntuacionService puntuacionService, UsuarioService usuarioService) {
        this.puntuacionService = puntuacionService;
        this.usuarioService = usuarioService;
    }

    @PostMapping("/{id}/sumar")
    public String sumarPuntuacion(@PathVariable("id") Long id, @RequestParam("puntuacion") int puntuacion) {
        puntuacionService.sumarPuntuacion(id, puntuacion);
        return "Puntuación sumada exitosamente.";
    }

    @PostMapping("/agregarPuntos/{idUsuarioAcosado}/{idUsuarioAyuda}/{puntos}")
    public void agregarPuntos(@PathVariable Long idUsuarioAcosado, @PathVariable Long idUsuarioAyuda, @PathVariable int puntos) {
        Usuario usuarioAcosado = usuarioService.obtenerUsuarioPorId(idUsuarioAcosado);
        Usuario usuarioAyuda = usuarioService.obtenerUsuarioPorId(idUsuarioAyuda);

        if(usuarioAcosado != null && usuarioAyuda != null){
            puntuacionService.agregarPuntos(usuarioAcosado, usuarioAyuda, puntos);
        }
    }
}