-- After "FROM purchases" add code to get rows where the name column contains "pudding"

SELECT *
FROM purchases
WHERE name LIKE '%pudding%';