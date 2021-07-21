-- Exemplo 1:
-- Inserindo apenas um unico estado por vez
INSERT INTO
  estados (nome, sigla, regiao, populacao)
VALUES
  ('Acre', 'AC', 'Norte', '0.83');
-- ***************************** --
  -- Exemplo 2:
  -- Inserindo mais de  um estado ao mesmo tempo
INSERT INTO
  estados (nome, sigla, regiao, populacao)
VALUES
  ('Alagoas', 'AL', 'Nordeste', 3.38),
  ('Amapá', 'AP', 'Norte', 0.8),
  ('Amazonas', 'AM', 'Norte', 4.06);