# Write your MySQL query statement below
select name, bonus
from Employee a LEFT JOIN Bonus b 
ON a.empId = b.empId
WHERE bonus is null or bonus < 1000;