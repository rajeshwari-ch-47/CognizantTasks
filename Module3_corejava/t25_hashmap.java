
import java.util.HashMap;
import java.util.Scanner;

public class t25_hashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student IDs and names (ID = -1 to stop):");

        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            if (id == -1) {
                break;
            }
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            map.put(id, name);
        }

        System.out.print("Enter ID to find: ");
        int searchId = sc.nextInt();
        String student = map.get(searchId);
        if (student != null) {
            System.out.println("Student name: " + student);
        } else {
            System.out.println("Student not found.");
        }
    }
}
