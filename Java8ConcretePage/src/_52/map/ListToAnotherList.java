package _52.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToAnotherList {

	public static void main(String[] args) {
		Person p1 = new Person(1, "Mohan", "student");
		Person p2 = new Person(2, "Sohan", "teacher");
		Person p3 = new Person(3, "Dinesh", "student");
		List<Person> personList = Arrays.asList(p1, p2, p3);

		List<Student> stdList = personList.stream().filter(p -> p.getPersonType().equals("student"))
				.map(p -> new Student(p.getId(), p.getName())).collect(Collectors.toList());

		stdList.forEach(e -> System.out.println(e.getId() + " " + e.getName()));
	}
}

class Person {
	private int id;
	private String name;
	private String personType;

	public Person(int id, String name, String personType) {
		this.id = id;
		this.name = name;
		this.personType = personType;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPersonType() {
		return personType;
	}
}

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
