CREATE DATABASE eCommerce;
USE eCommerce;

CREATE TABLE products(
	id INT(2),
	name VARCHAR (50) NOT NULL,
	price DECIMAL(7, 2),
    inStock INT(3),
    popular BOOLEAN,
    PRIMARY KEY (id)
);

INSERT INTO products VALUES(1, "Computador", 5550.00, 3, TRUE);
INSERT INTO products VALUES(2, "Bola de Futebol", 37.30, 17, TRUE);
INSERT INTO products VALUES(3, "Caneta", 2.50, 200, FALSE);
INSERT INTO products VALUES(4, "Cadeira", 110.00, 7, FALSE);
INSERT INTO products VALUES(5, "Pirulito", 1.00, 357, TRUE);
INSERT INTO products VALUES(6, "Lâmpada", 3.50, 151, FALSE);
INSERT INTO products VALUES(7, "Mochila", 105.00, 89, TRUE);
INSERT INTO products VALUES(8, "Televisão", 1500.00, 30, TRUE);

SELECT * FROM products WHERE price > 500;
SELECT * FROM products WHERE price < 500;
UPDATE products SET inStock = 0 WHERE id = 1;