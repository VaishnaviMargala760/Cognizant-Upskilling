SELECT
    city,
    COUNT(*) AS total_users
FROM Users
GROUP BY city
ORDER BY total_users DESC;