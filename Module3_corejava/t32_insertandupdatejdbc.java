
import java.sql.*;

public class t32_insertandupdatejdbc {

    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "yourpassword";
        return DriverManager.getConnection(url, user, password);
    }

    public void insertStudent(int id, String name) {
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
            System.out.println("Student inserted.");
        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
        }
    }

    public void updateStudentName(int id, String newName) {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Student updated.");
        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        t32_insertandupdatejdbc dao = new t32_insertandupdatejdbc();
        dao.insertStudent(1, "Alice");
        dao.updateStudentName(1, "Alice Updated");
    }
}
