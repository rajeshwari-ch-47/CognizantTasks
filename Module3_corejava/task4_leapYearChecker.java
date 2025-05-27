
import java.util.Scanner;

public class task4_leapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Nested conditional logic to check leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        scanner.close();
    }
}
