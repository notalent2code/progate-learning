-- Select the id, name and the number of items sold of the top 5 items sold
SELECT items.id, items.name, COUNT(*)
FROM sales_records
JOIN items
ON items.id = sales_records.item_id
GROUP BY items.id
ORDER BY COUNT(*) DESC
LIMIT 5;