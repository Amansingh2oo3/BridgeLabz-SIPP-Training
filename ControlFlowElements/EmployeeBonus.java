package ControlFlowElements;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for salary and years of service
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Check if service is more than 5 years
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus is: ₹" + bonus);
        } else {
            System.out.println("No bonus. Years of service must be more than 5.");
        }

        sc.close();
    }
}








