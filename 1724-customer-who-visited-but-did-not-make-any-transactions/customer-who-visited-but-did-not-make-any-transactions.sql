# Write your MySQL query statement below
SELECT customer_id, COUNT(DISTINCT visit_id) as count_no_trans FROM
(
    SELECT b.transaction_id, a.visit_id, a.customer_id as customer_id,  b.visit_id as t_cust
    FROM Visits a LEFT JOIN Transactions b on a.visit_id = b.visit_id
) T
WHERE t_cust is NULL
GROUP BY customer_id;