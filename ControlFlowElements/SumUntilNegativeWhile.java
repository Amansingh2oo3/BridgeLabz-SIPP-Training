package ControlFlowElements;

import java.util.Scanner;

public class SumUntilNegativeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0) {
                break; // Exit loop if input is zero or negative
            }

            total += input;
        }

        System.out.println("Total sum: " + total);
        sc.close();
    }
}