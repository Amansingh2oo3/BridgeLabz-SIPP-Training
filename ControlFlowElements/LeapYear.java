package ControlFlowElements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        if (year >= 1582) {
           
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The year " + year + " is not valid. Leap year check only works for year >= 1582.");
        }

        sc.close();
    }
}