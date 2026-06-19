SELECT t.request_at AS Day,
       ROUND(SUM(t.status != 'completed') / COUNT(*), 2) AS `Cancellation Rate`
FROM Trips t
JOIN Users u
  ON t.client_id = u.users_id
JOIN Users d
  ON t.driver_id = d.users_id
WHERE t.request_at BETWEEN '2013-10-01' AND '2013-10-03'
  AND u.banned = 'No'
  AND d.banned = 'No'
GROUP BY t.request_at
ORDER BY t.request_at;