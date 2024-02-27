# Write your MySQL query statement below
select name, bonus
from Employee a LEFT JOIN Bonus b 
ON a.empId = b.empId
WHERE Coalesce(bonus,0) < 1000;