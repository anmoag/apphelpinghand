

INSERT INTO usuarios (id_tipo, email, foto, latitud, longitud, pass, fecha_nacimiento, usuario_desde, token, sexo, nombre, apellido1, apellido2, curso, direccion, ciudad, codigo_postal, pais, telefono, logueado)
VALUES (1, 'usuario1@email.com', 'foto1.jpg', 0.0, 0.0, 'contraseña1', '1990-01-01', NOW(), 'token1', 'Masculino', 'Usuario', 'Uno', NULL, 'Informática', 'Calle Ejemplo 1', 'Ciudad Ejemplo', 12345, 'País Ejemplo', '123456789', 0);

INSERT INTO usuarios (id_tipo, email, foto, latitud, longitud, pass, fecha_nacimiento, usuario_desde, token, sexo, nombre, apellido1, apellido2, curso, direccion, ciudad, codigo_postal, pais, telefono, logueado)
VALUES (1, 'usuario2@email.com', 'foto2.jpg', 0.0, 0.0, 'contraseña2', '1990-01-01', NOW(), 'token2', 'Femenino', 'Usuario', 'Dos', NULL, 'Informática', 'Calle Ejemplo 2', 'Ciudad Ejemplo', 54321, 'País Ejemplo', '987654321', 0);

INSERT INTO mensajes (contenido, id_remite, id_destinatario, fecha_envio, leido)
VALUES ('Hola, ¿cómo estás?', 1, 2, NOW(), false);

INSERT INTO mensajes (contenido, id_remite, id_destinatario, fecha_envio, leido)
VALUES ('Hola, estoy bien. ¿Y tú?', 2, 1, NOW(), false);

INSERT INTO chat_mensajes (id_remitente, id_destinatario, contenido, fecha_envio)
VALUES (1, 2, 'Hola, ¿cómo estás en el chat?', NOW());

INSERT INTO chat_mensajes (id_remitente, id_destinatario, contenido, fecha_envio)
VALUES (2, 1, '¡Hola! Estoy bien, gracias.', NOW());

INSERT INTO puntuaciones (id_usuario_acosado, id_destinatario_ayuda, puntuacion)
VALUES (1, 2, 5);

INSERT INTO puntuaciones (id_usuario_acosado, id_destinatario_ayuda, puntuacion)
VALUES (2, 1, 4);

INSERT INTO incidencias (descripcion, fecha_hora, id_usuario, estado, prioridad, comentarios)
VALUES ('Problema técnico', NOW(), 1, 'En proceso', 'Alta', 'Comentario sobre la incidencia');

INSERT INTO incidencias (descripcion, fecha_hora, id_usuario, estado, prioridad, comentarios)
VALUES ('Error en el sistema', NOW(), 2,'En proceso','Alta','Comentario sobre la incidencia');

INSERT INTO incidencias (descripcion, fecha_hora, id_usuario, estado, prioridad, comentarios)
VALUES ('Error en el sistema', NOW(), 2, 'En proceso', 'Media', 'Comentario sobre el error');

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


INSERT INTO palabras (palabra) VALUES ('gilipollas'),
                                      ('imbécil'),
                                      ('cabrón'),
                                      ('cabrona'),
                                      ('Subnormal'),
                                      ('hijoputa'),
                                      ('hijaputa'),
                                      ('hijo de puta'),
                                      ('hija de puta'),
                                      ('tonto'),
                                      ('tonta'),
                                      ('puta'),
                                      ('puto'),
                                      ('capullo'),
                                      ('capulla'),
                                      ('payaso'),
                                      ('payasa');

INSERT INTO usuarios (id_tipo, email, foto, latitud, longitud, pass, fecha_nacimiento, usuario_desde, token, sexo, nombre, apellido1, apellido2, curso, direccion, ciudad, codigo_postal, pais, telefono, logueado)
VALUES
    (1, 'usuario1@example.com', 'foto1.jpg', 40.7128, -74.0060, 'password1', '1990-01-01', '2023-01-01', 'token1', 'M', 'Usuario 1', 'Apellido 1', 'Apellido 2', 'Curso 1', 'Dirección 1', 'Ciudad 1', 12345, 'País 1', '123456789', 1),
    (2, 'usuario2@example.com', 'foto2.jpg', 51.5074, -0.1278, 'password2', '1995-02-02', '2023-02-02', 'token2', 'F', 'Usuario 2', 'Apellido 3', 'Apellido 4', 'Curso 2', 'Dirección 2', 'Ciudad 2', 23456, 'País 2', '234567890', 0),
    (1, 'usuario3@example.com', 'foto3.jpg', 48.8566, 2.3522, 'password3', '1998-03-03', '2023-03-03', 'token3', 'M', 'Usuario 3', 'Apellido 5', 'Apellido 6', 'Curso 3', 'Dirección 3', 'Ciudad 3', 34567, 'País 3', '345678901', 1),
    (2, 'usuario4@example.com', 'foto4.jpg', -33.8688, 151.2093, 'password4', '1992-04-04', '2023-04-04', 'token4', 'F', 'Usuario 4', 'Apellido 7', 'Apellido 8', 'Curso 4', 'Dirección 4', 'Ciudad 4', 45678, 'País 4', '456789012', 0),
    (1, 'usuario5@example.com', 'foto5.jpg', 35.6895, 139.6917, 'password5', '1994-05-05', '2023-05-05', 'token5', 'M', 'Usuario 5', 'Apellido 9', 'Apellido 10', 'Curso 5', 'Dirección 5', 'Ciudad 5', 56789, 'País 5', '567890123', 1),
    (2, 'usuario6@example.com', 'foto6.jpg', -23.5505, -46.6333, 'password6', '1993-06-06', '2023-06-06', 'token6', 'F', 'Usuario 6', 'Apellido 11', 'Apellido 12', 'Curso 6', 'Dirección 6', 'Ciudad 6', 67890, 'País 6', '678901234', 0),
    (1, 'usuario7@example.com', 'foto7.jpg', 52.5200, 13.4050, 'password7', '1991-07-07', '2023-07-07', 'token7', 'M', 'Usuario 7', 'Apellido 13', 'Apellido 14', 'Curso 7', 'Dirección 7', 'Ciudad 7', 78901, 'País 7', '789012345', 1),
    (2, 'usuario8@example.com', 'foto8.jpg', 37.7749, -122.4194, 'password8', '1996-08-08', '2023-08-08', 'token8', 'F', 'Usuario 8', 'Apellido 15', 'Apellido 16', 'Curso 8', 'Dirección 8', 'Ciudad 8', 89012, 'País 8', '890123456', 0),
    (1, 'usuario9@example.com', 'foto9.jpg', -34.6037, -58.3816, 'password9', '1997-09-09', '2023-09-09', 'token9', 'M', 'Usuario 9', 'Apellido 17', 'Apellido 18', 'Curso 9', 'Dirección 9', 'Ciudad 9', 90123, 'País 9', '901234567', 1),
    (2, 'usuario10@example.com', 'foto10.jpg', 55.7558, 37.6176, 'password10', '1999-10-10', '2023-10-10', 'token10', 'F', 'Usuario 10', 'Apellido 19', 'Apellido 20', 'Curso 10', 'Dirección 10', 'Ciudad 10', 12345, 'País 10', '012345678', 0);

