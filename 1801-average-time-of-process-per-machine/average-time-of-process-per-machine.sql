# Write your MySQL query statement below
-- WITH END_TIME AS (
-- SELECT * FROM Activity WHERE activity_type = "end"
-- )
WITH processing as(
SELECT a.machine_id, a.process_id, a.timestamp as end_time, b.timestamp as start_time, (a.timestamp - b.timestamp) as processing_time
FROM Activity a LEFT JOIN Activity b ON a.machine_id=b.machine_id and a.process_id=b.process_id
WHERE b.activity_type="start" and a.activity_type='end')
SELECT machine_id, ROUND(AVG(processing_time),3) as processing_time
FROM processing
GROUP BY machine_id;