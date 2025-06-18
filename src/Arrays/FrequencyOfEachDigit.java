package Arrays;

import java.util.Scanner;

public class FrequencyOfEachDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (number < 0) {
            number = -number;
        }

        int[] frequency = new int[10];

        if (number == 0) {
            frequency[0] = 1; 
        } else {
            while (number > 0) {
                int digit = (int)(number % 10); 
                frequency[digit]++;             
                number /= 10;                
            }
        }

        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}