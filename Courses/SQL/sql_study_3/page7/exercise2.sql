SELECT countries.name, SUM(players.goals)
FROM players
JOIN countries
ON countries.id = players.country_id
GROUP BY countries.name;