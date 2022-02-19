-- Select the name column and the profit of the top 5 product with the highest profit
SELECT name, price - cost
FROM items
ORDER BY price - cost DESC
LIMIT 5;