
-- Borrar la base de datos si existe
DROP DATABASE IF EXISTS appHelping;

-- Crear la base de datos
CREATE DATABASE appHelping;

-- Usar la base de datos
USE appHelping;

-- Crear tabla usuarios
CREATE TABLE usuarios (
                          id BIGINT PRIMARY KEY AUTO_INCREMENT, -- El rango de valores posibles para un BIGINT generalmente
                          -- va desde -9223372036854775808 hasta 9223372036854775807.
                          id_tipo INT NOT NULL,
                          email VARCHAR(255) NOT NULL UNIQUE,
                          foto VARCHAR(255),
                          latitud DOUBLE NOT NULL,
                          longitud DOUBLE NOT NULL,
                          pass VARCHAR(255) NOT NULL,
                          fecha_nacimiento DATETIME,
                          usuario_desde DATETIME NOT NULL,
                          token VARCHAR(255),
                          sexo VARCHAR(255),
                          nombre VARCHAR(255) NOT NULL,
                          apellido1 VARCHAR(255),
                          apellido2 VARCHAR(255),
                          curso VARCHAR(255),
                          direccion VARCHAR(255) NOT NULL,
                          ciudad VARCHAR(255) NOT NULL,
                          codigo_postal INT NOT NULL,
                          pais VARCHAR(255) NOT NULL,
                          telefono VARCHAR(255),
                          logueado BOOLEAN
);

-- Crear tabla mensajes
CREATE TABLE mensajes (
                          id BIGINT PRIMARY KEY AUTO_INCREMENT,
                          contenido VARCHAR(255) NOT NULL,
                          remite_id BIGINT NOT NULL,
                          destinatario_id BIGINT NOT NULL,
                          fecha_envio DATETIME NOT NULL,
                          leido BOOLEAN,
                          FOREIGN KEY (remite_id) REFERENCES usuarios(id),
                          FOREIGN KEY (destinatario_id) REFERENCES usuarios(id)
);

-- Crear tabla chat_mensajes
CREATE TABLE chat_mensajes (
                           id BIGINT PRIMARY KEY AUTO_INCREMENT,
                           remitente_id BIGINT NOT NULL,
                           destinatario_id BIGINT NOT NULL,
                           contenido VARCHAR(255) NOT NULL,
                           fecha_envio DATETIME NOT NULL,
                           FOREIGN KEY (remitente_id) REFERENCES usuarios(id),
                           FOREIGN KEY (destinatario_id) REFERENCES usuarios(id)
);

CREATE TABLE puntuaciones (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            usuario_acosado_id BIGINT NOT NULL,
                            usuario_ayuda_id BIGINT NOT NULL,
                            puntuacion INT NOT NULL,
                            FOREIGN KEY (usuario_acosado_id) REFERENCES usuarios (id),
                            FOREIGN KEY (usuario_ayuda_id) REFERENCES usuarios (id)
);

CREATE TABLE incidencias (
                             id BIGINT PRIMARY KEY AUTO_INCREMENT,
                             descripcion VARCHAR(255) NOT NULL,
                             fecha_hora DATETIME NOT NULL,
                             usuario_id BIGINT,
                             estado VARCHAR(20),
                             prioridad VARCHAR(20),
                             comentarios TEXT,
                             FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE historial_acciones (
                            id BIGINT PRIMARY KEY AUTO_INCREMENT,
                            usuario_id BIGINT NOT NULL,
                            accion VARCHAR(255) NOT NULL,
                            fecha DATETIME NOT NULL,
                            FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE palabras (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          palabra VARCHAR(255)
);
INSERT INTO palabras (palabra) VALUES ('gilipollas');
INSERT INTO palabras (palabra) VALUES ('imbécil');
INSERT INTO palabras (palabra) VALUES ('cabrón');
INSERT INTO palabras (palabra) VALUES ('cabrona');
INSERT INTO palabras (palabra) VALUES ('Subnormal');
INSERT INTO palabras (palabra) VALUES ('hijoputa');
INSERT INTO palabras (palabra) VALUES ('hijaputa');
INSERT INTO palabras (palabra) VALUES ('hijo de puta');
INSERT INTO palabras (palabra) VALUES ('hija de puta');
INSERT INTO palabras (palabra) VALUES ('tonto');
INSERT INTO palabras (palabra) VALUES ('tonta');
INSERT INTO palabras (palabra) VALUES ('puta');
INSERT INTO palabras (palabra) VALUES ('puto');
INSERT INTO palabras (palabra) VALUES ('capullo');
INSERT INTO palabras (palabra) VALUES ('capulla');
INSERT INTO palabras (palabra) VALUES ('payaso');
INSERT INTO palabras (palabra) VALUES ('payasa');
