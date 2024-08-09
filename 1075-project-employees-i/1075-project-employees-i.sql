/* Write your T-SQL query statement below */
SELECT p.project_id, ROUND(AVG(CAST(e.experience_years AS decimal(18,3))), 2) AS average_years FROM Project p
LEFT JOIN Employee e
ON p.employee_id = e.employee_id
GROUP BY p.project_id
ORDER BY p.project_id