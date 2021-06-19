CREATE DATABASE HR;
USE HR;

CREATE TABLE employees(
    id INT (5),
    name VARCHAR (50) NOT NULL,
    wage DECIMAL (10, 2), 
    phone VARCHAR (10) NOT NULL,
	job VARCHAR (30),
    PRIMARY KEY (id)
);

INSERT INTO employees VALUES (1, "Miguel da Silva", 4500, "99876-5432", "Desenvolvedor Jr.");
INSERT INTO employees VALUES (2, "Laura da Silva", 7100, "99987-6543", "Gerente de Marketing");
INSERT INTO employees VALUES (3, "Augusto da Silva", 13500, "98876-5432", "Desenvolvedor Sênior");
INSERT INTO employees VALUES (4, "Joana da Silva", 9200, "97876-5432", "Desenvolvedora Plena");
INSERT INTO employees VALUES (5, "João da Silva", 8300, "95876-5432", "Supervisora de Projetos");

SELECT * FROM employees WHERE wage > 2000;
SELECT * FROM employees WHERE wage < 2000;
UPDATE employees SET phone = "95876-5232" WHERE id = 2;