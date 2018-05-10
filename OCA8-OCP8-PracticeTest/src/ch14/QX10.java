package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class QX10 {

	public static void main(String[] args) {
		List<Double> prices = Arrays.asList(1.2, 6.5, 3.0);
//		Market.checkPrices(prices, p -> {
//			String result = p < 5 ? "Correct" : "Too high";
//			System.out.println(result);
//		});
	}

}

class Market {

	static void checkPrices(List<Double> prices, Consumer scanner) {
		prices.forEach(scanner);
	}

}