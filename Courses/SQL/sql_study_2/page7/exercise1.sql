-- Get the total amount of money spent for each purchased_at date

SELECT SUM(price), purchased_at
FROM purchases
GROUP BY purchased_at
;