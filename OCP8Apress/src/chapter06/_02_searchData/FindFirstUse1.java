package chapter06._02_searchData;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstUse1 {

	public static void main(String[] args) {
		Method[] methods = Stream.class.getMethods();
		Optional<String> methodName = Arrays.stream(methods).map((Method method) -> method.getName())
				.filter(name -> name.endsWith("Match")).sorted().findFirst();
		
		System.out.println(methodName);
		System.out.println(methodName.orElse("Not found!"));
	}
}
