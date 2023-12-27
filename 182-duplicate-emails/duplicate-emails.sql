# Write your MySQL query statement below
SELECT email
FROM (
    SELECT email, COUNT(email) AS dup_count
    FROM Person
    GROUP BY email
) T 
WHERE dup_count > 1;