-- Get the specified data for the top 5 products with the highest sales
SELECT items.id, items.name, SUM(price) as 'sales total'
FROM sales_records
JOIN items ON items.id = sales_records.item_id
GROUP BY items.id, items.name
ORDER BY SUM(price) DESC
LIMIT 5;