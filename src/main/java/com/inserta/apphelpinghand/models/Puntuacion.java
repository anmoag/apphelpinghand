package com.inserta.apphelpinghand.models;

import jakarta.persistence.*;
import lombok.*;

    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    @ToString
    @Entity
    @Table(name = "puntuaciones")
    public class Puntuacion {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @ManyToOne // Esta anotación indica la relación de muchos a una entre Puntuacion y Usuario
        @JoinColumn(name = "id_usuario_acosado", referencedColumnName = "id") // Esta anotación se utiliza para especificar la columna
        // en la tabla puntuaciones que se utilizará como clave externa para la relación con la entidad Usuario
        private Usuario usuarioAcosado;
        @ManyToOne// Esta anotación indica la relación de muchos a una entre Puntuacion y Usuario
        @JoinColumn(name = "id_destinatario_ayuda", referencedColumnName = "id") // Esta anotación se utiliza para especificar la columna
        // en la tabla puntuaciones que se utilizará como clave externa para la relación con la entidad Usuario
        private Usuario usuarioAyuda;
        private int puntuacion;
}
