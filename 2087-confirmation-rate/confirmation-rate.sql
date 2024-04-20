WITH REQUESTS AS (
    SELECT USER_ID, COALESCE(SUM(CASE WHEN action='confirmed' THEN 1 ELSE 0 END),0) AS CONFIRMED, COUNT(*) AS TOTAL 
    FROM CONFIRMATIONS
    GROUP BY USER_ID
)
SELECT A.USER_ID AS USER_ID, COALESCE(ROUND((B.CONFIRMED/B.TOTAL),2),0) AS CONFIRMATION_RATE
FROM SIGNUPS A LEFT JOIN REQUESTS B ON A.USER_ID = B.USER_ID;