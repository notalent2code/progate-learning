-- After "FROM purchases" add code to get rows where the category column is "food"
-- OR the character_name column name is "Ken the Ninja"

SELECT *
FROM purchases
WHERE category = 'food' OR character_name = 'Ken the Ninja';