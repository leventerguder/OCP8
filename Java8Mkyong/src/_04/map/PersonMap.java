package _04.map;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.math.BigDecimal;

public class PersonMap {

	public static void main(String[] args) {
		List<Staff> staff = Arrays.asList(new Staff("mkyong", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)), new Staff("lawrence", 33, new BigDecimal(30000)));

		Function<Staff, String> f1 = (Staff s) -> s.getName();

		List<String> names = staff.stream().map(f1).collect(Collectors.toList());
		//List<String> names = staff.stream().map(s -> s.getName()).collect(Collectors.toList());
		System.out.println(names);
	}
}
