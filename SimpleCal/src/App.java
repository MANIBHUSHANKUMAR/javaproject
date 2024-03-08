import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int operationChoice = scanner.nextInt();

            double result = 0;

            if (operationChoice == 1) {
                result = num1 + num2;
                System.out.println("Result: " + result);
            } else if (operationChoice == 2) {
                result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (operationChoice == 3) {
                result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (operationChoice == 4) {

                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            } else if (operationChoice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}
