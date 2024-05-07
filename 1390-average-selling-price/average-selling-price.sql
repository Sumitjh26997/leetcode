# Write your MySQL query statement below
WITH TOTAL_SALES AS (
    SELECT PRODUCT_ID, SUM(UNITS) AS TOTAL_UNITS
    FROM UNITSSOLD
    GROUP BY PRODUCT_ID
),
TOTAL_PRICE AS (
    SELECT A.PRODUCT_ID, (A.PRICE * B.UNITS) AS TOTAL_PRICE
    FROM PRICES A LEFT JOIN UNITSSOLD B ON B.PURCHASE_DATE BETWEEN A.START_DATE AND A.END_DATE AND A.PRODUCT_ID = B.PRODUCT_ID
)
SELECT A.PRODUCT_ID, coalesce(ROUND(SUM(TOTAL_PRICE)/TOTAL_UNITS, 2),0) AS AVERAGE_PRICE
FROM TOTAL_PRICE A LEFT JOIN TOTAL_SALES B ON A.PRODUCT_ID = B.PRODUCT_ID
GROUP BY A.PRODUCT_ID
;