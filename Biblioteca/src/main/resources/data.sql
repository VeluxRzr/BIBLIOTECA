--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:

delete from ISBN;
delete from Autor;
delete from Titulo;
delete from Edicion;

INSERT INTO articulo(ISBN, Autor, Titulo, Edicion) VALUES 
('978-3-16-148410-0', 'J.K. Rowling', 'Harry Potter y la piedra filosofal', 'Primera Edición');
('978-1-86197-876-9', 'George Orwell', '1984', 'Edición Conmemorativa');
('978-0-7432-7356-5', 'F. Scott Fitzgerald', 'El gran Gatsby', 'Edición de 75 Aniversario');
('978-0-141-03435-4', 'Herman Melville', 'Moby Dick', 'Edición Clásica');
('978-0-316-02344-7', 'Jane Austen', 'Orgullo y prejuicio', 'Edición de 200 Aniversario');
('978-1-4028-9463-8', 'Mark Twain', 'Las aventuras de Tom Sawyer', 'Edición Especial');
('978-0-307-35238-8', 'J.R.R. Tolkien', 'El señor de los anillos', 'Edición de Coleccionista');
('978-0-06-112008-4', 'Harper Lee', 'Matar a un ruiseñor', 'Edición 50 Aniversario');
('978-0-141-03393-7', 'Gabriel García Márquez', 'Cien años de soledad', 'Edición Conmemorativa');
('978-0-385-53373-3', 'Victor Hugo', 'Los miserables', 'Edición de Bolsillo');
('978-1-56619-909-4', 'Miguel de Cervantes', 'Don Quijote de la Mancha', 'Edición Estudio Crítico');
('978-0-06-112241-5', 'Charles Dickens', 'Un cuento de Navidad', 'Edición Ilustrada');
('978-0-7432-7356-0', 'Leo Tolstoy', 'Guerra y paz', 'Edición Deluxe');
('978-1-4050-1818-1', 'Ernest Hemingway', 'El viejo y el mar', 'Edición de 60 Aniversario');
('978-1-4088-4567-8', 'Jack London', 'Colmillo Blanco', 'Edición Conmemorativa');
('978-1-907453-22-7', 'Dante Alighieri', 'La Divina Comedia', 'Edición de Lujo');
('978-0-345-53488-9', 'William Shakespeare', 'Hamlet', 'Edición Anotada');
('978-0-06-251242-5', 'Virginia Woolf', 'Mrs. Dalloway', 'Edición de Póster');
('978-0-141-03429-3', 'Franz Kafka', 'La metamorfosis', 'Edición Especial');
('978-0-06-249848-4', 'Homer', 'La Odisea', 'Edición Conmemorativa');

