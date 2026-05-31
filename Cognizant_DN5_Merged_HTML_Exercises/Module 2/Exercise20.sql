SELECT
    u.full_name,
    COUNT(r.registration_id) AS registrations
FROM Users u
LEFT JOIN Registrations r
ON u.user_id = r.user_id
GROUP BY u.user_id, u.full_name
ORDER BY registrations DESC;