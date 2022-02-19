-- Get the id of the product and the number of items sold for each product
SELECT item_id, COUNT(*)
FROM sales_records
GROUP BY item_id;