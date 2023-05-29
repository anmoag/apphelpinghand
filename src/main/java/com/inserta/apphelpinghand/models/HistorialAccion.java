package com.inserta.apphelpinghand.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "historial_acciones")
public class HistorialAccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY) //relación de muchos a uno
    @JoinColumn(name = "usuario_id", nullable = false) //relación entre Incidencia y Usuario
    private Usuario usuario;
    private String accion;
    private LocalDateTime fecha;

}
