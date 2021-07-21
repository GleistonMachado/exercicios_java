CREATE TABLE IF NOT EXISTS empresas (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR (255) NOT NULL,
  cnpj INT UNSIGNED,
  PRIMARY KEY (id),
  UNIQUE KEY (cnpj)
);
-- Tabela para o relacionamento da tabela empresas com a tabela cidades
CREATE TABLE IF NOT EXISTS empresas_unidades (
  empresa_id INT UNSIGNED NOT NULL,
  cidade_id INT UNSIGNED NOT NULL,
  sede TINYINT (1) NOT NULL,
  PRIMARY KEY (empresa_id, cidade_id)
);
-- DROP TABLE empresas_unidades;