CREATE TABLE pedido_adicional (
	pedido BIGINT(20) NOT NULL,
	adicional BIGINT(20) NOT NULL,
	FOREIGN KEY (pedido) REFERENCES pedido(id),
	FOREIGN KEY (adicional) REFERENCES adicional(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
