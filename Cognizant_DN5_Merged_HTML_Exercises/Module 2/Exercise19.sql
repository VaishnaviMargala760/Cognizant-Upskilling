SELECT
    COUNT(*) AS completed_events
FROM Events
WHERE status='completed';