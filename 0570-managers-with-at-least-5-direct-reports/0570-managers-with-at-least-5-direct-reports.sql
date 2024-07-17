# Write your MySQL query statement below
select e1.name from employee e1 JOIN employee e2 ON e1.id = e2.managerId
group by e1.name, e1.id
having count(e2.managerID) >= 5;