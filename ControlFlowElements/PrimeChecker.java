package ControlFlowElements;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();

        // Step 2: Check if the number is greater than 1
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            // Step 3: Loop from 2 to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // number is divisible by some other number
                }
            }
        }

        // Step 4: Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is Not a Prime Number.");
        }

        sc.close();
    }
}