package ControlFlowElements;

import java.util.Scanner;

public class AbundantNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get integer input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Find sum of proper divisors (excluding the number itself)
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if it's an abundant number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        sc.close();
    }
}