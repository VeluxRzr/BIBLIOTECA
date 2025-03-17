--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:


delete from libro;
delete from prestamo;
delete from socio;
)
INSERT INTO libro (isbm, titulo, autor, edicion, categoria ) VALUES 
(2587, 'Harry Potter y la piedra filosofal', 'J.K. Rowling', 1, 5),
(2588, '1984', 'George Orwell', 1, 4);



