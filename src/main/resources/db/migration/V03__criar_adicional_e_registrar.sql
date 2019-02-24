CREATE TABLE adicional (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	valor_adicional DECIMAL(19,2) DEFAULT NULL,
	tempo_adicional INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO adicional (nome, valor_adicional) VALUES ('Extra Bacon', 3.00);
INSERT INTO adicional (nome) VALUES ('Sem Cebola');
INSERT INTO adicional (nome, valor_adicional, tempo_adicional) VALUES ('Borda Recheada', 5.00, 5);
