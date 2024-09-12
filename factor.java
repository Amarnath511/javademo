import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Print the factors of the number
        System.out.println("Factors of " + number + " are:");

        // Iterate through numbers from 1 to the input number
        for (int i = 1; i <= number; i++) {
            // Check if i is a factor of number
            if (number % i == 0) {
                // Print the factor
                System.out.print(i + " ");
            }
        }
    }
}
