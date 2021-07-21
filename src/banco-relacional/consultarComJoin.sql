-- Exemplo 1:
SELECT
  *
FROM
  estados as e,
  cidades as c
WHERE
  e.id = c.estado_id;
-- ********** --
  -- Exemplo 2:
SELECT
  e.nome as 'Estado',
  cid.nome as 'Cidade',
  regiao as 'Região'
from
  estados e
  INNER JOIN cidades cid ON e.id = cid.estado_id;