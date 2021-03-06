-- Comando DESC descreve a tabela
DESC empresas;
-- *************************** --
SELECT
  *
FROM
  empresas;
-- *************************** --
SELECT
  *
FROM
  cidades;
-- *************************** --
  -- Alterando o tipo do campo cnpj
ALTER TABLE
  empresas
MODIFY
  cnpj VARCHAR (14);
-- *************************** --
  -- *************************** --
  -- Adicionando as Empresas e a relação com as Cidades
INSERT INTO
  empresas (nome, cnpj)
VALUES
  ('Bradesco', 95694186000123),
  ('Vale', 27887148000146),
  ('Cielo', 01598317000134);
INSERT INTO
  empresas_unidades (empresa_id, cidade_id, sede)
VALUES
  (1, 1, 1),
  (1, 2, 0),
  (2, 1, 0),
  (2, 2, 1);