# Write your MySQL query statement below
SELECT student_subject.student_id, student_subject.student_name , student_subject.subject_name , COUNT(exam.student_id) as attended_exams
FROM (
    SELECT student.* , subject.*
    FROM Students as student
    CROSS JOIN Subjects as subject
)as student_subject
LEFT JOIN Examinations as exam
ON student_subject.student_id  = exam.student_id
AND student_subject.subject_name = exam.subject_name
GROUP BY student_subject.student_id , student_subject.student_name , student_subject.subject_name
ORDER BY student_subject.student_id , student_subject.student_name, student_subject.subject_name