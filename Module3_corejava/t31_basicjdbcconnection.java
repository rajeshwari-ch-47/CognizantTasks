
import java.sql.*;

public class t31_basicjdbcconnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // adjust as needed
        String user = "root";
        String password = "yourpassword";

        try (Connection conn = DriverManager.getConnection(url, user, password); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
