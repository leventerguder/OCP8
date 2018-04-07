package chapter04.stream;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test01StreamPipelineExample {

	public static void main(String[] args) {
		Arrays.stream(Object.class.getMethods()).map((Method m) -> m.getName()).distinct().forEach(System.out::println);
		//
		System.out.println();
		Method[] objectMethods = Object.class.getMethods();
		Stream<Method> objectMethodStream = Arrays.stream(objectMethods);
		Stream<String> objectMethodNames = objectMethodStream.map(method -> method.getName());
		Stream<String> uniques = objectMethodNames.distinct();
		uniques.forEach(System.out::println);
	}
}
