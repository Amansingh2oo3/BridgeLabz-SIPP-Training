package Arrays;

import java.util.Scanner;

public class MeanHeight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] heights = new double[11];

        System.out.println("--- Football Team Mean Height Calculator ---");
        System.out.println("Please enter the height for each of the 11 players (in meters, e.g., 1.85):");

        for (int i = 0; i < heights.length; i++) {
            while (true) {
                System.out.print("Enter height for Player " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    double heightInput = scanner.nextDouble();
                    if (heightInput > 0) {
                        heights[i] = heightInput;
                        break;
                    } else {
                        System.out.println("Error: Height must be a positive number. Please try again.");
                    }
                } else {
                    System.out.println("Error: Invalid input. Please enter a numerical height.");
                    scanner.next();
                }
            }
        }

        double sumOfHeights = 0;
        for (double height : heights) {
            sumOfHeights += height;
        }

        double numberOfElements = heights.length;
        double meanHeight = sumOfHeights / numberOfElements;

        System.out.println("\n--- Calculation Results ---");
        System.out.printf("Total sum of heights: %.2f meters\n", sumOfHeights);
        System.out.printf("Number of players: %.0f\n", numberOfElements);
        System.out.printf("The mean height of the football team is: %.2f meters\n", meanHeight);

        scanner.close();
    }
}