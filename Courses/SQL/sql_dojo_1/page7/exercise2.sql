-- Get the total sales and total profit for the entire site
SELECT SUM(price) AS 'total sales', SUM(price - cost) AS 'total profit'
FROM sales_records
JOIN items ON items.id = sales_records.item_id;