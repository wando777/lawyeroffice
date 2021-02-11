CREATE TABLE jogadores(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	cpf VARCHAR(50) NOT NULL,
	id_clube BIGINT(20) NOT NULL,
	FOREIGN KEY (id_clube) REFERENCES clubes(id)
); --ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO clubes (nome, email, cpf, id_clube) values ('Flamengo','teste@gmai.com','12345678910',1);

