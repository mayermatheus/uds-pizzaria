CREATE TABLE sabor (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	tempo_adicional INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO sabor (nome) VALUES ('Calabresa');
INSERT INTO sabor (nome) VALUES ('Marguerita');
INSERT INTO sabor (nome, tempo_adicional) VALUES ('Portuguesa', 5);
