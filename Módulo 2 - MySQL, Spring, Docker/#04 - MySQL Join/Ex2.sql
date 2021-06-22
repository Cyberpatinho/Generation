CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
	id_categoria INT AUTO_INCREMENT,
    nome VARCHAR (255),
    popular BOOLEAN,
    PRIMARY KEY (id_categoria) 
);

CREATE TABLE tb_pizza (
	id_pizza INT AUTO_INCREMENT,
    id_categoria INT,
    sabor VARCHAR (255),
    preco DECIMAL (4, 2),
    vendas INT,
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria (nome, popular) 
	VALUES ("Kids", 0), ("Broto", 0), ("Grande", 1), ("Doce", 1), ("Promocional", 1);
    
INSERT INTO tb_pizza (sabor, preco, vendas, id_categoria)
	VALUES ("Calabresa", 35.50, 52, 5), ("Brigadeiro", 45.00, 27, 4), ("Batata Frita", 24.50, 30, 1), ("Frango com Catupiry", 44.50, 42, 3), 
	("Pepperoni", 51.00, 27, 3), ("Beringela", 32.50, 22, 2), ("Doce de Leite", 44.00, 32, 4), ("Lombo", 51.00, 33, 3);
    
SELECT * FROM tb_pizza WHERE preco > 45;
SELECT * FROM tb_pizza WHERE preco >= 29 AND preco <= 60;
SELECT * FROM tb_pizza WHERE sabor LIKE "%C%";
SELECT * FROM tb_pizza INNER JOIN tb_categoria ON tb_pizza.id_categoria = tb_categoria.id_categoria;
SELECT * FROM tb_pizza INNER JOIN tb_categoria ON tb_pizza.id_categoria = tb_categoria.id_categoria WHERE tb_categoria.nome = "Grande";