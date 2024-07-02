/* Write your T-SQL query statement below */
SELECT W1.id FROM Weather W1 INNER JOIN Weather W2 ON W1.recordDate = DATEADD(day, 1, W2.recordDate) WHERE W1.temperature > W2.temperature;