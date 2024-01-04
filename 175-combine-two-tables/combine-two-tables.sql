# Write your MySQL query statement below
SELECT a.firstName as firstName, a.lastName as lastName, b.city as city, b.state as state
FROM Person a LEFT JOIN Address b 
ON a.personId = b.personId;