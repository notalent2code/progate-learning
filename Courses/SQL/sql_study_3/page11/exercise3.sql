SELECT countries.name AS 'country name', AVG(players.goals) AS 'average score'
FROM players
JOIN countries
ON countries.id = players.country_id
GROUP BY countries.name;