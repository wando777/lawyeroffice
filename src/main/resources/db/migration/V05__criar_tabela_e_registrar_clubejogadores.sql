CREATE TABLE clube_jogadores (
	id_clube BIGINT(20) NOT NULL,
	id_jogador BIGINT(20) NOT NULL,
	FOREIGN KEY (id_jogador) REFERENCES jogadores(id),
	FOREIGN KEY (id_clube) REFERENCES clubes(id)
); --ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO clube_jogadores (id_clube, id_jogador) values (1,1);
INSERT INTO clube_jogadores (id_clube, id_jogador) values (2,1);
INSERT INTO clube_jogadores (id_clube, id_jogador) values (3,1);
INSERT INTO clube_jogadores (id_clube, id_jogador) values (4,1);
INSERT INTO clube_jogadores (id_clube, id_jogador) values (4,2);
INSERT INTO clube_jogadores (id_clube, id_jogador) values (5,2);
INSERT INTO clube_jogadores (id_clube, id_jogador) values (6,2);





