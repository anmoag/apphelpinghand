package com.inserta.apphelpinghand.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "mensajes")
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String contenido;
    @ManyToOne// Establece una relación entre Mensaje y Usuario.
    // Cada mensaje tiene un remitente y un destinatario que son instancias de la clase Usuario.
    @JoinColumn(name = "remite_id", referencedColumnName = "id") //Especifica la columna en la tabla mensajes que se utiliza
    // para almacenar la clave externa del remitente.
    private Usuario remitente;
    @ManyToOne // Establece una relación entre Mensaje y Usuario.
    // Cada mensaje tiene un remitente y un destinatario que son instancias de la clase Usuario.
    @JoinColumn(name = "destinatario_id", referencedColumnName = "id") //Especifica la columna en la tabla mensajes que se utiliza
    // para almacenar la clave externa del destinatario.
    private Usuario destinatario;
    private LocalDateTime fechaEnvio;
    private boolean leido;
}
