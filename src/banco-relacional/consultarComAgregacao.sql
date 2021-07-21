-- Exemplo 1: Soma o valor de toda a população
SELECT
  sum(populacao) as total
FROM
  estados;
-- *********** --
  -- Exemplo 2: Soma a pupulação por Região
SELECT
  regiao as 'Região',
  sum(populacao) as total
FROM
  estados
GROUP BY
  regiao
ORDER BY
  total DESC;
-- *********** --
  -- Exemplo 3: Soma a media da pupulação
SELECT
  avg(populacao) as total
FROM
  estados;