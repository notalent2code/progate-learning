-- Get the specified data for men's, women's, and gender neutral products
SELECT items.gender, SUM(price) AS 'sales total'
FROM sales_records
JOIN items ON items.id = sales_records.item_id
GROUP BY items.gender;