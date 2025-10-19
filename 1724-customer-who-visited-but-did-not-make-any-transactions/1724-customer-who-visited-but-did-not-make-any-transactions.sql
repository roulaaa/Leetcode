SELECT V.customer_id, COUNT(V.customer_id) AS count_no_trans
FROM Visits V
LEFT JOIN Transactions T ON V.visit_id = T.visit_id
WHERE V.visit_id not in (SELECT visit_id From Transactions T)
GROUP BY V.customer_id