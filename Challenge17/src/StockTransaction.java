//Javier Reyna EG1305A

import java.text.DecimalFormat;


public class StockTransaction {
	public static void main(String[] args) {
	
		//Prices and Rates
		int num_of_shares = 1000;
		double price_buy = 32.87;
		final double commision_rate = 0.02;
		double price_sell = 33.92;
		
		//Calculation and print outs for buying the stock
		double cost_buy = num_of_shares * price_buy;
		
		double commision_buy = commision_rate * cost_buy;
		
		DecimalFormat aFormatter = new DecimalFormat("###,###");
		
		System.out.println("Joe paid $"+ aFormatter.format(cost_buy)+ " for 1000 stocks.");
		
		System.out.println("Joe paid $" + commision_buy + " as commision for the purchase of the stocks.");
		
		//calculations and print outs for selling the stock
		double cost_sell = num_of_shares * price_sell;
		
		double commision_sell = commision_rate * cost_sell;
		
		DecimalFormat bFormatter = new DecimalFormat("##,###");
		
		System.out.println("Joe then sold the 1000 stocks for $"+ bFormatter.format(cost_sell) + ".");
		
		System.out.println("Joe ended up paying $"+ commision_sell + " on commision for the stocks sold.");
		
		//Profit made
		
		double difference = cost_sell + commision_sell - cost_buy + commision_buy;
		
		DecimalFormat cFormatter = new DecimalFormat("####");
		
		System.out.println("Joe made profit of $" + cFormatter.format (difference) + " after selling his stock "
		+ "and paying the two commisions to this broker.");
		
		System.exit(0);
		
	}
}
