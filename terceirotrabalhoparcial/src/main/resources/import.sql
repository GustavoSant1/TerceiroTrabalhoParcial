INSERT INTO Editora (nomeEditora) VALUES 
('Editora Moderna'),
('Atlas'),
('Pearson'),
('Companhia das Letras'),
('Sextante'),
('Intrínseca'),
('Record'),
('Abril'),
('Saraiva'),
('Panini');

INSERT INTO Livro (dataEmprestimo, tituloLivro, autorLivro ,anoPublicacao , isbn,Editora_codEditora) VALUES
('2024-01-10 10:00:00', 'Java Básico', 'João Silva', 2020, '1111111111', 1),
('2024-02-15 11:30:00', 'Spring Boot Avançado', 'Maria Oliveira', 2021, '2222222222', 2),
('2024-03-20 14:00:00', 'Banco de Dados MySQL', 'Carlos Souza', 2019, '3333333333', 3),
('2024-04-05 09:15:00', 'Estruturas de Dados', 'Ana Lima', 2018, '4444444444', 4),
('2024-05-12 16:45:00', 'Algoritmos em Java', 'Ricardo Santos', 2022, '5555555555', 5),
('2024-06-25 13:00:00', 'Design Patterns', 'Gabriela Torres', 2017, '6666666666', 6),
('2024-07-08 18:30:00', 'Redes de Computadores', 'Pedro Almeida', 2016, '7777777777', 7),
('2024-08-14 08:20:00', 'Engenharia de Software', 'Fernanda Costa', 2023, '8888888888', 8),
('2024-09-22 19:10:00', 'Arquitetura de Sistemas', 'Lucas Rocha', 2015, '9999999999', 9),
('2024-10-30 21:00:00', 'Inteligência Artificial', 'Camila Martins', 2024, '1010101010', 10);

INSERT INTO Usuarios (nomeUsuario, email, dataNascimento) VALUES
('Maria Souza', 'maria@email.com', '1995-06-12'),
('João Silva', 'joao@email.com', '1990-02-15'),
('Ana Lima', 'ana@email.com', '2000-11-30'),
('Carlos Mendes', 'carlos@email.com', '1985-09-25'),
('Fernanda Torres', 'fernanda@email.com', '1998-03-08'),
('Ricardo Alves', 'ricardo@email.com', '1993-07-19'),
('Patrícia Gomes', 'patricia@email.com', '1989-12-05'),
('Gabriel Rocha', 'gabriel@email.com', '2002-01-22'),
('Juliana Costa', 'juliana@email.com', '1996-05-17'),
('Felipe Araújo', 'felipe@email.com', '1992-08-14');

INSERT INTO Emprestimo(dataEmprestimo,dataDevolucao,Livro_codLivros,Usuarios_codUsuario)VALUES
('2024-01-12','2024-01-22','1','1'),
('2024-02-16','2024-02-26',' 2','2'),
('2024-03-21','2024-03-31','3','3'),
('2024-04-06','2024-04-16','4','4'),
('2024-05-13','2024-05-23','5','5'),
('2024-06-26','2024-07-06','6','6'),
('2024-07-09','2024-07-19','7','7'),
('2024-08-15','2024-08-25','8','8'),
('2024-09-23','2024-10-03','9','9'),
('2024-10-31','2024-11-10','10','10');
