# Write your MySQL query statement below
SELECT a.customer_id as customer_id, COUNT(DISTINCT a.visit_id) as count_no_trans FROM
Visits a LEFT JOIN Transactions b ON a.visit_id = b.visit_id
WHERE b.transaction_id IS NULL
GROUP BY a.customer_id;