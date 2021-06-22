CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria (
	id_categoria INT AUTO_INCREMENT,
    nome VARCHAR (255),
    em_estoque BOOLEAN,
    PRIMARY KEY (id_categoria) 
);

CREATE TABLE tb_produto (
	id_produto INT AUTO_INCREMENT,
    id_categoria INT,
    nome VARCHAR (255),
    preco DECIMAL (4, 2),
    vendas INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria (nome, em_estoque) 
	VALUES ("Beleza", 0), ("Sem Tarja", 0), ("Higiene", 1), ("Infantil", 1), ("Sob Prescrição", 1);
    
INSERT INTO tb_produto (nome, preco, vendas, id_categoria)
	VALUES ("Escova de Dentes", 3.50, 47, 3), ("Shampoo", 7.30, 33, 1), ("Xarope Sabor Morango", 13.99, 17, 4), ("Estomazil", 2.69, 89, 2), 
	("Benegrip", 11.25, 152, 2), ("Álcool em Gel", 15.50, 72, 3), ("Amoxicilina", 50.24, 19, 5), ("Cetoconazol", 35.44, 22, 5);
    
SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco >= 3 AND preco <= 60;
SELECT * FROM tb_produto WHERE nome LIKE "%B%";
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria;
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria WHERE tb_categoria.nome = "Higiene";