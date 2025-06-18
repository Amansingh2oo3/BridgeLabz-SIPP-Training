package Arrays;
import java.util.Scanner;

public class ArraySumUntilZeroOrTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative number to stop):");

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();
            if (input <= 0) {
                break;
            }

            // Store value if there's space in the array
            if (index < 10) {
                numbers[index] = input;
                index++;
            } else {
                break;
            }
        }
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println("Total sum of numbers = " + total);

        scanner.close();
    }
}