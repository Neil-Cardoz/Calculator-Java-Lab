// UserInput.java

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
}