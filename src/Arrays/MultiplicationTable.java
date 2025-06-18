package Arrays;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        while (true) {
            System.out.print("Enter a number to print its multiplication table: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        int[] multiplicationResults = new int[10];

        for (int i = 0; i < 10; i++) {
            multiplicationResults[i] = number * (i + 1);
        }

        System.out.println("\n--- Multiplication Table of " + number + " ---");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResults[i]);
        }

        scanner.close();
    }
}
