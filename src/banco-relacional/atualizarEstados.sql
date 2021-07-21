-- Exemplo 1:
UPDATE
  estados
SET
  nome = 'Maranhão'
WHERE
  sigla = 'MA';
SELECT
  nome
FROM
  estados
WHERE
  sigla = 'MA';
-- *********** --
  -- *********** --
  -- Exemplo 2:
UPDATE
  estados
SET
  nome = 'Paraná',
  populacao = 11.32
WHERE
  sigla = 'PR';
SELECT
  estados.nome
FROM
  estados
WHERE
  sigla = 'PR';