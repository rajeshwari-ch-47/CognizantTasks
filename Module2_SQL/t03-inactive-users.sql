SELECT *
FROM Users
WHERE user_id NOT IN (
  SELECT user_id
  FROM Registrations
  WHERE registration_date >= DATE('now', '-90 days')
);
