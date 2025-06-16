package Java_Programming_Elements;

public class qsix {
	public static void main(String [] args) {
		double fee = 125000;
        double discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("the discount is" + discount + 
        		"The final fee is " + finalFee ); 
	}

}