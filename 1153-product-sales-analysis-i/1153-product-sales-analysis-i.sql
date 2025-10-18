-- Write a solution to report the product_name, year, and price for each sale_id in the Sales table.
SELECT P.product_name, S.year, price
FROM Product P
JOIN Sales S ON P.product_id = S.product_id
