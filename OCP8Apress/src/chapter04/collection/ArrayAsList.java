package chapter04.collection;

import java.util.List;
import java.util.Arrays;

class ArrayAsList {
	public static void main(String[] args) {
		Double[] temperatureArray = { 31.1, 30.0, 32.5, 34.9, 33.7, 27.8 };
		System.out.println("The original array is: " + Arrays.toString(temperatureArray));
		List<Double> temperatureList = Arrays.asList(temperatureArray);
		temperatureList.set(0, 35.2);
		System.out.println("The modified array is: " + Arrays.toString(temperatureArray));

		// temperatureList.remove(0); // java.lang.UnsupportedOperationException
		// temperatureList.add(20.0); // java.lang.UnsupportedOperationException
	}
}