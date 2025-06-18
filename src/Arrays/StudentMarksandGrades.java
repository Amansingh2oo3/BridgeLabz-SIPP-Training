package Arrays;

import java.util.Scanner;

public class StudentMarksandGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentage = new double[numStudents];
        char[] grade = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            System.out.print("Physics: ");
            physics[i] = scanner.nextInt();
            if (physics[i] < 0) {
                System.out.println("Invalid input. Marks must be positive.");
                i--;
                continue;
            }

            System.out.print("Chemistry: ");
            chemistry[i] = scanner.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Invalid input. Marks must be positive.");
                i--;
                continue;
            }

            System.out.print("Maths: ");
            maths[i] = scanner.nextInt();
            if (maths[i] < 0) {
                System.out.println("Invalid input. Marks must be positive.");
                i--;
                continue;
            }

            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        scanner.close();
    }
}