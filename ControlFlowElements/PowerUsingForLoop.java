package ControlFlowElements;

import java.util.Scanner;

public class PowerUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (exponent): ");
        int power = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;  // result = result * number
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);
        sc.close();
    }
}
