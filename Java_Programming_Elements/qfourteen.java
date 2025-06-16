package Java_Programming_Elements;

import java.util.Scanner;
public class qfourteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance in feets");
		double distanceFeet = input.nextDouble();
		double yards = distanceFeet / 3;
        double miles = yards / 1760;
        System.out.println("the distance is: " + distanceFeet + 
        		"the distance in Yards is:" + yards + "the distance in miles is: " + miles);
	}

}