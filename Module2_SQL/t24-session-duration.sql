SELECT e.title,
       AVG((julianday(s.end_time) - julianday(s.start_time)) * 24 * 60) AS avg_duration_mins
FROM Sessions s
JOIN Events e ON s.event_id = e.event_id
GROUP BY s.event_id;
