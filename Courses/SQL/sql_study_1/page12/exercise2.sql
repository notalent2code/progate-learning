-- After "WHERE character_name = "Ken the Ninja", add code to sort price column in ascending order

SELECT *
FROM purchases
WHERE character_name = "Ken the Ninja"
ORDER BY price ASC;
