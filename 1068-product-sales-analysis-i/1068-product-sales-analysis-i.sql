# Write your MySQL query statement below
SELECT Product.product_name, Sales.year, Sales.price from Product INNER JOIN Sales ON Product.product_id = Sales.product_id;