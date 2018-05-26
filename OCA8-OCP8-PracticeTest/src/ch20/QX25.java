package ch20;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class QX25 {

	public static void main(String[] args) {

		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Mustang", 1967));
		cars.add(new Car("Thunderbird", 1967));
		cars.add(new Car("Escort", 1975));
		//
		ConcurrentMap<Integer, List<Car>> map = cars.stream().collect(Collectors.groupingByConcurrent(Car::getYear));

		System.out.print(map);
		// {1975=[Escort], 1967=[Mustang, Thunderbird]}
	}

}

class Car {

	private String model;
	private int year;

	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return model;
	}

}
