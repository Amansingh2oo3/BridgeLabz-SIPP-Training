package Java_Programming_Elements;

import java.util.Scanner;
public class qtwelve {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base");
		double base = input.nextDouble();
		System.out.print("Enter the height");
		double height = input.nextDouble();
		double areaCm2 = 0.5 * base * height;
		double areaIn2 = areaCm2 / 6.4516;
		System.out.println("The area of triangle in cm^2 is " + areaCm2 + " cm²" + 
		"and in In^2 is " + areaIn2 +" in²");
		
		
	}

}