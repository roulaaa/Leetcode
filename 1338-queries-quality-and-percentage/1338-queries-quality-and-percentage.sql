SELECT query_name, ROUND(AVG(rating / position), 2) AS quality, ROUND(SUM(IF(rating < 3, 1, 0)) / COUNT(*) * 100, 2) AS poor_query_percentage
FROM Queries
WHERE query_name IS NOT NULL 
  AND position IS NOT NULL 
  AND rating IS NOT NULL
GROUP BY query_name;
