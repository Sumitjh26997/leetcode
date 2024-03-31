WITH Exam AS (select student_id, subject_name, count(*) as attended_exams from
Examinations
group by student_id, subject_name)
SELECT a.student_id, a.student_name, b.subject_name, COALESCE(c.attended_exams,0) as attended_exams
FROM Students a CROSS JOIN Subjects b ON 1 = 1
LEFT JOIN Exam c ON a.student_id = c.student_id AND b.subject_name = c.subject_name
ORDER BY a.student_id, b.subject_name;