package ControlFlowElements;

import java.util.Scanner;

public class Greatestfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;
        int counter = number - 1;

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Exit loop when the greatest factor is found
            }
            counter--;
        }

        System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        sc.close();
    }
}
