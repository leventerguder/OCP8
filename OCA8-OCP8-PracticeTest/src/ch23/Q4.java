package ch23;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Function;
//import java.util.function.Predicate;
//
//public class Q4 {
//}
//
//interface ApplyFilter {
//	void filter(List<String> input);
//}
//
//class FilterBobs {
//	static Function<String, String> first = s -> {
//		System.out.println(s);
//		return s;
//	};
//
//	static Predicate second = t -> "bob".equalsIgnoreCase(t); // compile error
//
//	public void process(ApplyFilter a, List<String> list) {
//		a.filter(list);
//	}
//
//	public static void main(String[] args) {
//		final List<String> people = new ArrayList<>();
//		people.add("Bob");
//		people.add("bob");
//		people.add("Jennifer");
//		people.add("Samantha");
//
//		final FilterBobs f = new FilterBobs();
//
//		f.process(q -> {
//			q.removeIf(second);
//			q.forEach(first); //compile error
//		}, people);
//	}
//}

// D. Two lines of code do not compile.