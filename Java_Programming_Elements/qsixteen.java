package Java_Programming_Elements;

import java.util.Scanner;
public class qsixteen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("Maximum number of handshakes possible among " + n + 
        		" students is " + handshakes);
	}

}