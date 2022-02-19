-- Get the specified data for products with a higher sales value than "grey hoodie"
SELECT items.id, items.name, SUM(price) AS 'sales total'
FROM sales_records
JOIN items ON items.id = sales_records.item_id
GROUP BY items.id, items.name
HAVING SUM(price) > (
  SELECT SUM(price)
  FROM sales_records
  JOIN items ON items.id = sales_records.item_id
  WHERE items.name = 'grey hoodie'
);