/* Write your T-SQL query statement below */
SELECT s.product_id, tb.first_year, s.quantity, s.price
FROM (SELECT product_id, MIN(year) AS first_year FROM Sales GROUP BY product_id) tb
JOIN Product p ON p.product_id = tb.product_id
JOIN Sales s ON tb.product_id = s.product_id
WHERE tb.first_year = s.year;