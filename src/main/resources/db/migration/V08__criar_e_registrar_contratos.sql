CREATE TABLE contratos(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	salario BIGINT(20) NOT NULL,
	inicio Date(20),
	fim Date(20),
	id_jogador BIGINT(20) NOT NULL,
	FOREIGN KEY (id_jogador) REFERENCES jogadores(id)
); --ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO contratos (salario, inicio, fim, id_jogador) values (7777, '2020-12-10', '2020-12-12', 1);
