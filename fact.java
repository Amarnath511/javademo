import java.util.Scanner;

class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, fact = 1;

        System.out.println("Enter a number: ");
        int num = scanner.nextInt(); // Use scanner.nextInt() to get user input

        // Calculate factorial
        for (i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);

        scanner.close(); // Close the scanner
    }
}
