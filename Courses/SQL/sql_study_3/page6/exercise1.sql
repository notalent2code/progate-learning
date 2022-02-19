SELECT *
FROM players
-- Add the table name after the JOIN to combine the table 
JOIN countries
-- Add a join condition
ON countries.id = players.country_id;