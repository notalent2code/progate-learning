-- Get only the data where the total price is larger than 20
-- from the data grouped by purchased_at

SELECT SUM(price), purchased_at
FROM purchases
GROUP BY purchased_at
HAVING SUM(price) > 20
;