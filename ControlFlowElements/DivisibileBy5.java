package ControlFlowElements;
import java.util.Scanner;
public class DivisibileBy5 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the element: ");
		int num = input.nextInt();
		
		System.out.println("Is the number " + num + " divisible by 5? " + (num % 5 == 0));
		
	}

}