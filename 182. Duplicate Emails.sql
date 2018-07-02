# Write your MySQL query statement below
SELECT email from Person GROUP BY Email HAVING count( email ) > 1