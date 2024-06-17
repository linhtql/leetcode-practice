-- where referee_id != 2 is not enough, because NULL compared to 2 is UNKNOWN
SELECT Customer.name
FROM Customer
WHERE Customer.referee_id <> 2 OR Customer.referee_id IS NULL