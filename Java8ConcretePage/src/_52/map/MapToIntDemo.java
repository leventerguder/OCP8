package _52.map;

import java.util.List;
import java.util.Arrays;

public class MapToIntDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, 20);
		Employee e2 = new Employee(2, 15);
		Employee e3 = new Employee(3, 30);
		List<Employee> list = Arrays.asList(e1, e2, e3);

		int sum = list.stream().mapToInt(e -> e.getAge()).sum();
		System.out.println(sum);
	}
}

class Employee {
	private int id;
	private int age;

	public Employee(int id, int age) {
		this.id = id;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}
}
