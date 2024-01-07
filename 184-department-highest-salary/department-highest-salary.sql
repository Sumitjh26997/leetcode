# Write your MySQL query statement below
SELECT b.name as Department, a.name as Employee, a.salary as Salary FROM
(SELECT id, name, salary, departmentId, rank() OVER (partition by departmentId order by salary DESC) AS salary_rank
FROM Employee) a LEFT JOIN Department b ON a.departmentId = b.id
WHERE a.salary_rank = 1;