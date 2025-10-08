SELECT id, COUNT(*) as num
FROM (
    SELECT requester_id AS id FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS id FROM RequestAccepted 
) as t
GROUP BY id
ORDER BY NUM DESC
LIMIT 1