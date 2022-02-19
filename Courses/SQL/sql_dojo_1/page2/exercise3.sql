-- Group all users by age and get the age and number of users per age
SELECT age, COUNT(*)
FROM users
GROUP by age;