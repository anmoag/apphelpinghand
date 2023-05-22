package models;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private int idTipo;

    @Column(nullable = false, unique = true)
    private String email;

    private String foto;

    @Column(nullable = false)
    private double latitud;

    @Column(nullable = false)
    private double longitud;

    @Column(nullable = false)
    private String pass;

    private LocalDateTime fechaNacimiento;

    @Column(nullable = false)
    private LocalDateTime usuarioDesde;

    private String token;

    private String sexo;

    @Column(nullable = false)
    private String nombre;

    private String apellido1;

    private String apellido2;

    private String curso;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String ciudad;

    @Column(nullable = false)
    private int codigoPostal;

    @Column(nullable = false)
    private String pais;

    @Column(nullable = false)
    private String telefono;

    private boolean logueado;



}
