package ControlFlowElements;
import java.util.Scanner;
public class naturalNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num = input.nextInt();
		
		if (num >= 0) {
			int sum = (num * (num + 1) / 2) ;
			System.out.println("The sum of " + num + " natural numbers is " + sum);
		}
		else {
			System.out.println("Entered number is not a Natural Number");
		}
		
		
		      
	}

}