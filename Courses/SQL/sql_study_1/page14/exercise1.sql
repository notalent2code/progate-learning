-- After "FROM purchases" add code to get rows where purchased_at column date is earlier or equal to "2018-11-01"

SELECT *
FROM purchases
WHERE purchased_at <= '2018-11-01';