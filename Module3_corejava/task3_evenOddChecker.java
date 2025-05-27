
import java.util.Scanner;

public class task3_evenOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Check if even or odd using modulus operator
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        scanner.close();
    }
}
