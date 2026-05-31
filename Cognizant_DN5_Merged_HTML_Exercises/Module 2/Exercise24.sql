SELECT
ROUND(
SUM(status='completed') * 100 / COUNT(*),
2
) AS completion_rate
FROM Events;