CREATE DATABASE db_cidade_das_frutas;
USE db_cidade_das_frutas;

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
	VALUES ("Da Estação", 1), ("Leve 2 Pague 1", 1), ("Produção Local", 1), ("Fresquinha", 1), ("Importada", 1);
    
INSERT INTO tb_produto (nome, preco, vendas, id_categoria)
	VALUES ("Laranja 500g", 1.90, 152, 1), ("Uva 500g", 5.50, 130, 2), ("Morango 500g", 3.50, 113, 3), ("Abacaxi 1un", 6.75, 89, 5), 
	("Amora 500g", 11.25, 77, 5), ("Melão 1un", 4.75, 80, 3), ("Caju 500g", 3.90, 91, 4), ("Melancia 1un", 8.99, 101, 1);
    
SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco >= 3 AND preco <= 60;
SELECT * FROM tb_produto WHERE nome LIKE "%C%";
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria;
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria WHERE tb_categoria.nome = "Produção Local";