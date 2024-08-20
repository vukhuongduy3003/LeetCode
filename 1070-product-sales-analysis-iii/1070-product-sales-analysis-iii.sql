/* Write your T-SQL query statement below */
WITH CTE AS (
    SELECT product_id, MIN(year) AS first_year
    FROM Sales GROUP BY product_id
)
SELECT s.product_id, first_year, quantity, price
FROM Sales s JOIN CTE ON s.product_id = CTE.product_id AND s.year = CTE.first_year;