SELECT D.name as Department, e.name as Employee, e.salary as Salary
FROM Employee e
JOIN Department d on e.departmentId = d.id
where e.salary = (
    SELECT MAX(e.salary) FROM Employee e
    WHERE e.departmentId = d.id
)
