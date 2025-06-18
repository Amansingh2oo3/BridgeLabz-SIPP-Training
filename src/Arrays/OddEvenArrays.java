package Arrays;

import java.util.Scanner;
public class OddEvenArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int number; 
        while (true) {
            System.out.print("Please enter a natural number (a positive integer): ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt(); 
                if (number > 0) { 
                    break;
                } else {
                    System.out.println("Error: The number must be positive. Please try again.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;
        System.out.println("\nSeparating numbers from 1 to " + number + "...");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) { 
                evenNumbers[evenIndex] = i;
                evenIndex++; 
            } else { 
                oddNumbers[oddIndex] = i; 
                oddIndex++; 
            }
        }
        System.out.println("\n--- Results ---");

        System.out.print("Odd Numbers: [");
        for (int i = 0; i < oddIndex; i++) { 
            System.out.print(oddNumbers[i]);
            if (i < oddIndex - 1) { 
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Even Numbers: [");
        for (int i = 0; i < evenIndex; i++) { 
            System.out.print(evenNumbers[i]);
            if (i < evenIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}