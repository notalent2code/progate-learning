-- After "FROM purchases" add code to get a maximum of 5 rows
-- of the price column in descending order

SELECT *
FROM purchases
ORDER BY price DESC
LIMIT 5;