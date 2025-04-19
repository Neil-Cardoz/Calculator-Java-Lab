// UserInput.java

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    // Method to take two integer inputs from the user and return them as an array
    int[] userInput() {
        int[] numbers = new int[2];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Number:");
        numbers[0] = scan.nextInt();

        System.out.println("Enter 2nd Number:");
        numbers[1] = scan.nextInt();

        return numbers;
    }

    // Method to take a single integer input from the user
    int userSingleInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        return scan.nextInt();
    }
     // Method to display the menu and perform operations based on user choice
     void displayMenu() {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            System.out.println("\nSelect the operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci Sequence");
            System.out.println("6. Square");
            System.out.println("7. Cube");
            System.out.println("8. Square Root");
            System.out.println("9. Exit");
            System.out.print("Choice: ");

            try {
                int choice = scan.nextInt();

                switch (choice) {
                    case 1 -> {
                        int[] nums = userInput();
                        System.out.println("Result: " + calc.addition(nums));
                    }
                    case 2 -> {
                        int[] nums = userInput();
                        System.out.println("Result: " + calc.subtraction(nums));
                    }
                    case 3 -> {
                        int[] nums = userInput();
                        System.out.println("Result: " + calc.multiplication(nums));
                    }
                    case 4 -> {
                        int[] nums = userInput();
                        System.out.println("Result: " + calc.division(nums));
                    }
                    case 5 -> {
                        System.out.print("Enter number of Fibonacci terms: ");
                        int n = scan.nextInt();
                        calc.fibonacci(n);
                        System.out.println();
                    }
                    case 6 -> {
                        int x = userSingleInput();
                        System.out.println("Square: " + calc.square(x));
                    }
                    case 7 -> {
                        int x = userSingleInput();
                        System.out.println("Cube: " + calc.cube(x));
                    }
                    case 8 -> {
                        int x = userSingleInput();
                        System.out.println("Square Root: " + calc.sqrt(x));
                    }
                    case 9 -> {
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please select a valid operation.");
                }
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            } catch (InputMismatchException ime) {
                System.err.println("Invalid input; please enter integers only.");
                scan.nextLine(); // clear buffer
            }
        }
    }
}