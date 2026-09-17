SELECT E.name as Employee FROM Employee E
JOIN Employee M on M.id = E.managerId
WHERE E.salary > M.salary

