/* Write your T-SQL query statement below */
SELECT b.category, COUNT(account_id) AS accounts_count
FROM Accounts
RIGHT JOIN (VALUES('Low Salary'), ('Average Salary'), ('High Salary')) AS b(category)
ON CASE WHEN income < 20000 THEN 'Low Salary'
WHEN income >= 20000 AND income <= 50000 THEN 'Average Salary'
ELSE 'High Salary' END = b.category
GROUP BY b.category;