package Java_Programming_Elements;

public class qfour {
	public static void main (String[] args) {
		int costPrice = 129;
		int sellingPrice = 191;
		int profit = costPrice - sellingPrice;
		double profitPercentage = ((double)profit / costPrice) * 100;
		System.out.println("the cost price of INR" + costPrice +
				"The selling price of INR " + sellingPrice+ 
				"The profit on the INR" + profit  );
		System.out.println("profitPercentage" + String.format("%.2f", profitPercentage) + "%");

	}

}