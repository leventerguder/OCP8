package _40.sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Mahesh", 12));
		list.add(new Student(2, "Suresh", 15));
		list.add(new Student(3, "Nilesh", 10));

		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println();
		list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println();

		list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
