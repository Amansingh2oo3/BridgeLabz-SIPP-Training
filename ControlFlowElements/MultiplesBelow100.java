package ControlFlowElements;

import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            int multiple = number;

            while (multiple < 100) {
                System.out.println(multiple);
                multiple += number;
            }
        } else {
            System.out.println("Please enter a positive number less than 100.");
        }

        sc.close();
    }
}
