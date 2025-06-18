package Arrays;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;
        double[] salary = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            salary[i] = scanner.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("Invalid salary. Please enter a positive value.");
                i--;
                continue;
            }

            System.out.print("Years of Service: ");
            yearsOfService[i] = scanner.nextDouble();
            if (yearsOfService[i] < 0) {
                System.out.println("Invalid years of service. Please enter a non-negative value.");
                i--;
                continue;
            }
        }

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = 0.05 * salary[i]; 
            } else {
                bonus[i] = 0.02 * salary[i]; 
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Employee Bonus Details ---");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d: Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                              (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Totals ---");
        System.out.printf("Total Bonus Payout = ₹%.2f\n", totalBonus);
        System.out.printf("Total Old Salary = ₹%.2f\n", totalOldSalary);
        System.out.printf("Total New Salary = ₹%.2f\n", totalNewSalary);

        scanner.close();
    }
}