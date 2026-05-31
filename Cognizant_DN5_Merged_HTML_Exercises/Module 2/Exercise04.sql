SELECT
    HOUR(start_time) AS session_hour,
    COUNT(*) AS total_sessions
FROM Sessions
GROUP BY HOUR(start_time)
ORDER BY total_sessions DESC;