package _03.filter;

import java.util.Arrays;
import java.util.List;

public class FilterPerson {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("mkyong", 30), new Person("jack", 20),
				new Person("lawrence", 40));

		Person foundPerson = persons.stream().filter(s -> "jack".equals(s.getName())).findAny().orElse(null);
		System.out.println(foundPerson);

		//
		String name = persons.stream().filter(x -> "jack".equals(x.getName())).map(Person::getName).findAny()
				.orElse("");
		
		System.out.println(name);
	}
}
