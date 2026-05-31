SELECT
    MONTH(start_date) AS month_no,
    COUNT(*) AS total_events
FROM Events
GROUP BY MONTH(start_date)
ORDER BY month_no;