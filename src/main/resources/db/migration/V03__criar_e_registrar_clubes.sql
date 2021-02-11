CREATE TABLE clubes(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	id_jogador BIGINT(20),
	FOREIGN KEY (id_jogador) REFERENCES jogadores(id)
); --ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO clubes (nome, id_jogador) values ('Flamengo',1);
INSERT INTO clubes (nome, id_jogador) values ('Corinthians', null);
INSERT INTO clubes (nome, id_jogador) values ('Treze',null);
INSERT INTO clubes (nome, id_jogador) values ('Campinense',null);
INSERT INTO clubes (nome, id_jogador) values ('Palmeiras',null);
INSERT INTO clubes (nome, id_jogador) values ('Águia de Marabá',null);
