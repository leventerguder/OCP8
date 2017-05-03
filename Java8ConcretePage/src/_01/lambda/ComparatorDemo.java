package _01.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ram", 20));
		list.add(new Student("Shyam", 22));
		list.add(new Student("Kabir", 18));

		Comparator<Student> comp = (Student s1, Student s2) -> s1.getName().compareTo(s2.getName());
		Collections.sort(list, comp);

		list.forEach(System.out::println);

	}
}
