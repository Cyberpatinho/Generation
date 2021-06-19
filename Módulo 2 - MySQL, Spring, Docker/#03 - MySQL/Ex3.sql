CREATE DATABASE school;
USE school;

CREATE TABLE students(
	name VARCHAR (50) NOT NULL,
    age INT(2),
    class CHAR,
    grade DECIMAL (2, 1),
	email VARCHAR(50),
    PRIMARY KEY (email)
);

INSERT INTO students VALUES("Henrique da Silva", 15, "A", 7.0, "henrique@gmail.com");
INSERT INTO students VALUES("Mario da Silva", 14, "A", 7.5, "mario@gmail.com");
INSERT INTO students VALUES("Silvia da Silva", 15, "A", 6.0, "silvia@gmail.com");
INSERT INTO students VALUES("Lucas da Silva", 16, "A", 4.0, "lucas@gmail.com");
INSERT INTO students VALUES("Helena da Silva", 15, "B", 8.0, "helena@gmail.com");
INSERT INTO students VALUES("Bianca da Silva", 14, "B", 9.0, "bianca@gmail.com");
INSERT INTO students VALUES("Caio da Silva", 15, "B", 8.5, "caio@gmail.com");
INSERT INTO students VALUES("Luana da Silva", 15, "B", 8.0, "luana@gmail.com");

SELECT * FROM students WHERE grade > 7;
SELECT * FROM students WHERE grade < 7;
UPDATE students SET class = "B" WHERE email="mario@gmail.com"