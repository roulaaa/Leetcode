SELECT 
CASE 
    WHEN (SELECT count(*) from Employee e) < 2 THEN NULL 
    ELSE (
        SELECT DISTINCT salary 
        FROM Employee 
        ORDER BY salary DESC
    LIMIT 1
    OFFSET 1)

    END AS SecondHighestSalary;
