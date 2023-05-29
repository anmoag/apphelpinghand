package com.inserta.apphelpinghand.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "incidencias")
public class Incidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descripcion;
    private LocalDateTime fechaHora;
    @ManyToOne(fetch = FetchType.LAZY) //relación de muchos a uno
    @JoinColumn(name = "usuario_id") //relación entre Incidencia y Usuario
    private Usuario usuario;
    private String estado;
    private String prioridad;
    @Lob // Objetos de gan tamaño
    private String comentarios;
}
