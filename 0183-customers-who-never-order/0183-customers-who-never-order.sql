SELECT C.name as Customers
FROM Customers C
WHERE C.id NOT IN (
    SELECT O.customerId 
    FROM Orders O
);