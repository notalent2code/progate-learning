-- Add a condition in the WHERE clause to group rows
-- for which the character_name is "Ken the Ninja"

SELECT SUM(price), purchased_at
FROM purchases
WHERE character_name = 'Ken the Ninja'
GROUP BY purchased_at
;