package com.inserta.apphelpinghand.controllers;

import com.inserta.apphelpinghand.models.HistorialAccion;
import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.service.HistorialAccionService;
import com.inserta.apphelpinghand.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historial")
public class HistorialAccionController {
    private final HistorialAccionService historialAccionService;
    private final UsuarioService usuarioService;

    public HistorialAccionController(HistorialAccionService historialAccionService, UsuarioService usuarioService) {
        this.historialAccionService = historialAccionService;
        this.usuarioService = usuarioService;
    }

    @PostMapping("/{usuarioId}")
    public HistorialAccion registrarAccion(@PathVariable Long usuarioId, @RequestBody String accion) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        return historialAccionService.agregarAccion(usuario, accion);
    }

    @GetMapping("/{usuarioId}")
    public List<HistorialAccion> obtenerHistorialPorUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        return historialAccionService.obtenerHistorialPorUsuario(usuario);
    }

    @DeleteMapping("/{usuarioId}")
    public void eliminarHistorialPorUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        historialAccionService.eliminarHistorialPorUsuario(usuario);
    }
}
