SELECT P.email as Email
FROM Person P
GROUP BY P.email
HAVING COUNT(P.email)>1;
