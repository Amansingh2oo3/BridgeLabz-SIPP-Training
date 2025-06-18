package Arrays;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int count = scanner.nextInt();

        double[] height = new double[count]; 
        double[] weight = new double[count]; 
        double[] bmi = new double[count];
        String[] status = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter height (in meters): ");
            height[i] = scanner.nextDouble();

            System.out.print("Enter weight (in kilograms): ");
            weight[i] = scanner.nextDouble();
        }

        for (int i = 0; i < count; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nBMI Report");
        for (int i = 0; i < count; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s\n",
                              i + 1, height[i], weight[i], bmi[i], status[i]);
        }

        scanner.close();
    }
}
