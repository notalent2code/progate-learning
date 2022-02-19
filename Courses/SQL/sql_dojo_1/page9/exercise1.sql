-- Get the id, name and number of items for users who have purchased 10 items or more
SELECT users.id, users.name, COUNT(*) AS 'number'
FROM sales_records
JOIN users ON users.id = sales_records.user_id
GROUP BY users.id, users.name
HAVING COUNT(*) >= 10;