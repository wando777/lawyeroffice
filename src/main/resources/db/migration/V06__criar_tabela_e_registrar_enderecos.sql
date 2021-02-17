CREATE TABLE enderecos
(
   id BIGINT (20) PRIMARY KEY AUTO_INCREMENT,
   logradouro VARCHAR(50) NOT NULL,
   numero VARCHAR(50) NOT NULL,
   complemento VARCHAR(50),
   bairro VARCHAR(50) NOT NULL,
   cep VARCHAR(50) NOT NULL,
   id_jogador BIGINT (20) NOT NULL,
   id_cidade BIGINT (20) NOT NULL,
   FOREIGN KEY (id_jogador) REFERENCES jogadores (id),
   FOREIGN KEY (id_cidade) REFERENCES cidades (id)
);
--ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO enderecos (logradouro, numero, complemento, bairro, cep, id_jogador, id_cidade) values ('Rua teste','123',null, 'Bairro do teste', '58570-123', 1, 1);