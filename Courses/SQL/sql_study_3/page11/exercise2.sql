SELECT *
FROM players
JOIN countries
ON countries.id = players.country_id
WHERE countries.name = 'Japan' AND players.height >= 180;