package chapter06._02_searchData;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class FindFirstUse2 {

	public static void main(String[] args) {
		OptionalDouble temperature = DoubleStream.of(-10.1, -5.4, 6.0, -3.8, 8.9, 2.2).filter(temp -> temp > 0)
				.findFirst();
		System.out.println(temperature);
		System.out.println(temperature.getAsDouble());
		
		OptionalDouble temperature2 = DoubleStream.of(-10.1, -5.4, 6.0, -3.8, 8.9, 2.2).filter(temp -> temp > 0)
				.findAny();
		System.out.println(temperature2);
		System.out.println(temperature2.getAsDouble());
	}
}
