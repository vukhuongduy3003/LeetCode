/* Write your T-SQL query statement below */
SELECT E1.name FROM Employee E1
JOIN (SELECT managerId, COUNT(*) AS cnt FROM Employee GROUP BY managerId HAVING COUNT(*) >= 5) E2
ON E1.id = E2.managerId;