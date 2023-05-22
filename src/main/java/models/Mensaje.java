package models;

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

    @Column(nullable = false)
    private String contenido;

    @ManyToOne(fetch = FetchType.LAZY) // Establece una relación entre Mensaje y Usuario.
    // Cada mensaje tiene un remitente y un destinatario que son instancias de la clase Usuario.

    @JoinColumn(name = "remite_id", nullable = false) //Especifica la columna en la tabla mensajes que se utiliza
    // para almacenar la clave externa del remitente. El atributo nullable = false dice que el remitente no puede ser nulo

    private Usuario remitente;

    @ManyToOne(fetch = FetchType.LAZY) // Establece una relación entre Mensaje y Usuario.
    // Cada mensaje tiene un remitente y un destinatario que son instancias de la clase Usuario.

    @JoinColumn(name = "destinatario_id", nullable = false) //Especifica la columna en la tabla mensajes que se utiliza
    // para almacenar la clave externa del destinatario. El atributo nullable = false dice que el destinatario no puede ser nulo

    private Usuario destinatario;

    @Column(nullable = false)
    private LocalDateTime fechaEnvio;

    @Column(nullable = false)
    private boolean leido;

}
