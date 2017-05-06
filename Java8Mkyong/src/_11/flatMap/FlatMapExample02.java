package _11.flatMap;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class FlatMapExample02 {

	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.setName("mkyong");
		obj1.addBook("Java 8 in Action");
		obj1.addBook("Spring Boot in Action");
		obj1.addBook("Effective Java (2nd Edition)");

		Student obj2 = new Student();
		obj2.setName("zilap");
		obj2.addBook("Learning Python, 5th Edition");
		obj2.addBook("Effective Java (2nd Edition)");

		List<Student> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);

		Function<Student, Set<String>> f1 = student -> student.getBook();

		Function<Set<String>, Stream<String>> f2 = x -> x.stream();
		//

		Stream<Set<String>> mapped = list.stream().map(f1);
		mapped.flatMap(f2).collect(Collectors.toList()).forEach(System.out::println);
		
		//mapped.map(f2).collect(Collectors.toList()).forEach(System.out::println);
	

		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends
		// R>> mapper);

	}
}
