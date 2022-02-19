-- After "FROM purchases" add code to get rows that is equal to "2018-10-10" in the purchased_at column

SELECT *
FROM purchases
WHERE purchased_at = '2018-10-10';