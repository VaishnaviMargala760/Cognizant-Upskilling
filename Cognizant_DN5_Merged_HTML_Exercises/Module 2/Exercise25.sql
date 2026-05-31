SELECT
    e.title,
    COUNT(DISTINCT r.registration_id) AS registrations,
    COUNT(DISTINCT s.session_id) AS sessions,
    COUNT(DISTINCT rs.resource_id) AS resources,
    ROUND(AVG(f.rating),2) AS avg_rating
FROM Events e
LEFT JOIN Registrations r
ON e.event_id = r.event_id
LEFT JOIN Sessions s
ON e.event_id = s.event_id
LEFT JOIN Resources rs
ON e.event_id = rs.event_id
LEFT JOIN Feedback f
ON e.event_id = f.event_id
GROUP BY e.event_id, e.title;