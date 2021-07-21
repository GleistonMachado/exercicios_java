-- Exemplo 1:
SELECT
  *
FROM
  estados;
-- *********** --
  -- Exemplo 2:
SELECT
  nome,
  sigla
FROM
  estados;
-- *********** --
  -- Exemplo 3:
SELECT
  sigla,
  e.nome as 'Estado'
from
  estados e;
-- *********** --
  -- Exemplo 4:
SELECT
  sigla,
  e.nome as 'Estado'
from
  estados e
WHERE
  regiao = 'Sul';
-- *********** --
  -- Exemplo 5:
SELECT
  nome,
  regiao,
  populacao
from
  estados
WHERE
  populacao >= 10
ORDER BY
  populacao DESC;