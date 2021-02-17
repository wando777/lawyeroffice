CREATE TABLE telefones
(
   telefone VARCHAR(50),
   id_jogador BIGINT (20) NOT NULL,
   FOREIGN KEY (id_jogador) REFERENCES jogadores (id)
);
--ENGINE=InnoDB DEFAULT CHARSET=utf8;