/* Write your T-SQL query statement below */
WITH tblSum AS (
    SELECT
        person_name,
        SUM(weight) OVER(ORDER BY Turn ASC) TotalW
    FROM
        Queue
)
SELECT
    TOP 1 person_name
FROM
    tblSum
WHERE
    TotalW <= 1000
ORDER BY
    TotalW DESC;