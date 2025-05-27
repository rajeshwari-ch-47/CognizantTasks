SELECT strftime('%Y-%m', registration_date) AS reg_month,
       COUNT(*) AS reg_count
FROM Registrations
WHERE registration_date >= DATE('now', '-12 months')
GROUP BY reg_month
ORDER BY reg_month;
