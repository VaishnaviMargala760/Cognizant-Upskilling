SELECT
    e.title,
    COUNT(r.registration_id) * e.ticket_price AS estimated_revenue
FROM Events e
LEFT JOIN Registrations r
ON e.event_id = r.event_id
GROUP BY e.event_id, e.title, e.ticket_price;