-- Use AS to label the column "total team score"
SELECT SUM(goals) AS 'total team score'
FROM players;