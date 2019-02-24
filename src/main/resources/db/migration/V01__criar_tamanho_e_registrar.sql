CREATE TABLE tamanho (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	valor DECIMAL(19,2) NOT NULL,
	tempo_preparo INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tamanho (nome, valor, tempo_preparo) VALUES ('Pequena', 20.00, 15);
INSERT INTO tamanho (nome, valor, tempo_preparo) VALUES ('Média', 30.00, 20);
INSERT INTO tamanho (nome, valor, tempo_preparo) VALUES ('Grande', 40.00, 25);
