CREATE TABLE telefones
(  id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
   telefone VARCHAR(50),
   id_jogador BIGINT (20) NOT NULL,
   FOREIGN KEY (id_jogador) REFERENCES jogadores (id)
);
--ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO telefones (telefone, id_jogador) values ('999888777',1);
INSERT INTO telefones (telefone, id_jogador) values ('999888555',1);