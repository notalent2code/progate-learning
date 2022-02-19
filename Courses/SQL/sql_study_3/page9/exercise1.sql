SELECT *
FROM players
LEFT JOIN teams
ON teams.id = players.previous_team_id;