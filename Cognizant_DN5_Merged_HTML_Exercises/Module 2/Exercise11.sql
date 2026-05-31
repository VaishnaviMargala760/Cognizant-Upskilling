SELECT
    registration_date,
    COUNT(*) AS total_users
FROM Users
GROUP BY registration_date
ORDER BY registration_date;