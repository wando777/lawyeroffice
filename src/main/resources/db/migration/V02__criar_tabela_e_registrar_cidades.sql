CREATE TABLE cidades (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	id_estado BIGINT(20) NOT NULL,
	FOREIGN KEY (id_estado) REFERENCES estados(id)
); --ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cidades (nome, id_estado) values ('Campina Grande', 15);
