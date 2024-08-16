CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT AS
BEGIN
    RETURN (
        /* Write your T-SQL query statement below. */
        SELECT MAX(salary) FROM (SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rank FROM Employee) AS tbl WHERE rank = @N
    );
END