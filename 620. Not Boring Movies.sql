# Write your MySQL query statement below
SELECT * FROM CINEMA c WHERE c.id % 2 = 1 AND c.description <> 'boring' ORDER BY c.rating DESC