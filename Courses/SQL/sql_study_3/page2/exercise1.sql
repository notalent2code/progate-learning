SELECT name
FROM players
WHERE goals > (
  -- Write an SQL statement below to get the number of Will's scored goals
  SELECT goals
  FROM players
  WHERE name = 'Will'
)
;