-- Get the user id and name of unique users who purchased "sandals"
SELECT DISTINCT(users.id), users.name
FROM sales_records
JOIN users ON users.id = sales_records.user_id
JOIN items ON items.id = sales_records.item_id
WHERE items.name = 'sandals'
ORDER BY users.id;