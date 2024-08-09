/* Write your T-SQL query statement below */
SELECT p.product_id, ISNULL(ROUND(SUM(p.price * u.units) / NULLIF(CAST(SUM(u.units) AS FLOAT), 0), 2), 0) AS average_price FROM Prices p
LEFT JOIN UnitsSold u ON p.product_id = u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;