SELECT players.name, countries.name
FROM players
JOIN countries
ON countries.id = players.country_id;