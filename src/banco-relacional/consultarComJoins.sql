-- *********** --
-- Exemplo 1:
SELECT
  c.nome as "Cidades",
  p.nome as 'Prefeitos',
  area
FROM
  cidades c
  INNER JOIN prefeitos p ON c.id = p.cidade_id;
-- *********** --
  -- Exemplo 2:
select
  c.nome as "Cidades",
  p.nome as 'Prefeitos',
  area
from
  cidades c
  left join prefeitos p on c.id = p.cidade_id;
-- *********** --
  -- Exemplo 3:
select
  c.nome as "Cidades",
  p.nome as 'Prefeitos',
  area
from
  cidades c
  right join prefeitos p on c.id = p.cidade_id;
-- *********** --
  -- Exemplo 4: FULL JOIN
select
  *
from
  cidades c
  left join prefeitos p on c.id = p.cidade_id
UNION
select
  *
from
  cidades c
  right join prefeitos p on c.id = p.cidade_id;