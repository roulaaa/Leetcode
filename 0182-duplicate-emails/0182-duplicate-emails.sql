SELECT email as Email
from Person
GROUP BY Email
Having count(Email) > 1
