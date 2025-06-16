package ControlFlowElements;
import java.util.Scanner;
public class Votee {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the Age Of the Candidate:");
		int age = input.nextInt();
		
		if (age<18) {
			System.out.println("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}

}