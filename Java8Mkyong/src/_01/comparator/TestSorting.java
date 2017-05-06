package _01.comparator;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSorting {

	public static void main(String[] args) {
		List<Developer> list = new ArrayList<Developer>();

		list.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		list.add(new Developer("alvin", new BigDecimal("80000"), 20));
		list.add(new Developer("jason", new BigDecimal("100000"), 10));
		list.add(new Developer("iris", new BigDecimal("170000"), 55));

		// 1)classic
		Comparator<Developer> byName = new Comparator<Developer>() {

			@Override
			public int compare(Developer o1, Developer o2) {
				return o2.getName().compareTo(o1.getName());
			}

		};

		// 2)lambda expression
		Comparator<Developer> byNameLambda = (o1, o2) -> o1.getName().compareTo(o2.getName());

		Collections.sort(list, byName);

		list.forEach(System.out::println);
		System.out.println();
		list.sort(byNameLambda);
		list.forEach(System.out::println);
		
		//
		System.out.println();
		Comparator<Developer> byAge = (Developer d1 , Developer d2) -> d1.getAge()-d2.getAge();
		list.sort(byAge);
		
		list.forEach(System.out::println);
		
		//
		System.out.println();
		list.sort(byAge.reversed());
		list.add(new Developer("jasoccn", new BigDecimal("10000000"), 100)); //not exception!
		list.forEach(System.out::println);
	}
}
