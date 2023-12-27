-- Write your PostgreSQL query statement below
SELECT product_id
FROM
(SELECT product_id, recyclable
FROM Products
WHERE low_fats = 'Y') T
WHERE recyclable = 'Y';