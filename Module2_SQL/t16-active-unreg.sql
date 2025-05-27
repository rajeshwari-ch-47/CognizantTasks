SELECT *
FROM Users
WHERE registration_date >= DATE('now', '-30 days')
  AND user_id NOT IN (SELECT user_id FROM Registrations);
