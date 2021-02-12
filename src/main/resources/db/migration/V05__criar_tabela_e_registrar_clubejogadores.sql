CREATE TABLE clube_jogadores (
	id_clube BIGINT(20) NOT NULL,
	id_jogador BIGINT(20) NOT NULL,
	FOREIGN KEY (id_jogador) REFERENCES jogadores(id),
	FOREIGN KEY (id_clube) REFERENCES clubes(id)
); --ENGINE=InnoDB DEFAULT CHARSET=utf8;





