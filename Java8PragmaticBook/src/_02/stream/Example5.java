package _02.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example5 {
	public static void main(String[] args) {
		Person obama = new Person("Barack Obama", 53);
		Person bush2 = new Person("George Bush", 68);
		Person clinton = new Person("Bill Clinton", 68);
		Person bush1 = new Person("George HW Bush", 90);

		Person[] personArray = new Person[] { obama, bush2, clinton, bush1 };
		List<Person> personList = Arrays.asList(personArray);

		Comparator<Person> comparator = (Person p1, Person p2) -> Integer.compare(p1.age, p2.age);

		Person oldest = personList.stream().max(comparator).get();

		Comparator<Person> comparator2 = (Person p1, Person p2) -> Integer.compare(p1.age, p2.age);

		Person youngest = personList.stream().min(comparator2).get();

		System.out.println(oldest);
		System.out.println(youngest);

		Person y1 = personList.stream().min(Comparator.comparing((Person p) -> p.age)).get();

		System.out.println(y1);

	}

}
