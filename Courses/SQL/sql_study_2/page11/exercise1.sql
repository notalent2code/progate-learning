-- Get the total amount of money spent for each category

SELECT SUM(price), category
FROM purchases
GROUP BY category
;