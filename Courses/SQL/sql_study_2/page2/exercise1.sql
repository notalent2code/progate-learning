-- Get the data from the price column with sales tax included

SELECT name, price, price * 1.09
FROM purchases;