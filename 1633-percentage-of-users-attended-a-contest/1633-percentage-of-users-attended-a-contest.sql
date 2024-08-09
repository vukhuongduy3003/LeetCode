/* Write your T-SQL query statement below */
SELECT contest_id, ROUND(CAST(COUNT(contest_id) AS FLOAT) * 100 / (SELECT COUNT(user_id) FROM Users), 2) AS percentage
FROM Register
GROUP BY contest_id
ORDER BY percentage DESC, contest_id ASC;