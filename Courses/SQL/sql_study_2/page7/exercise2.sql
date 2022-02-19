-- Get the number of purchases for each purchased_at date

SELECT COUNT(price), purchased_at
FROM purchases
GROUP BY purchased_at
;