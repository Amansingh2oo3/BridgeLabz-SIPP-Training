package Java_Programming_Elements;

import java.util.Scanner;
public class qseventeen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();
        
        double r1 =  a + b *c;
        double r2 =  a * b + c;
        double r3 =  c + a / b; 
        double r4 = a % b + c;
        
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + r1);
        System.out.println("a * b + c = " + r2);
        System.out.println("c + a / b = " + r3);
        System.out.println("a % b + c = " + r4);
	}

}