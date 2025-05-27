
import java.util.Random;
import java.util.Scanner;

public class t10_numberguessing {

    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1; // random number 1 to 100
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess the number between 1 and 100:");

        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Too low, try again.");
            } else if (guess > target) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }

        scanner.close();
    }
}
