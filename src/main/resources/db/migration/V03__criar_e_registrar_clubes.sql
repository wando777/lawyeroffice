CREATE TABLE clubes(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL
); --ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO clubes (nome) values ('Flamengo');
INSERT INTO clubes (nome) values ('Corinthians');
INSERT INTO clubes (nome) values ('Treze');
INSERT INTO clubes (nome) values ('Campinense');
INSERT INTO clubes (nome) values ('Palmeiras');
INSERT INTO clubes (nome) values ('Águia de Marabá');