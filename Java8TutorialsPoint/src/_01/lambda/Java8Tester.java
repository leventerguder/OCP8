package _01.lambda;

public class Java8Tester {

	public static void main(String[] args) {

		MathOperation addition = (int a, int b) -> a + b;
		MathOperation subs = (a, b) -> a - b;
		MathOperation multip = (int a, int b) -> {
			return a * b;
		};
		MathOperation div = (int a, int b) -> {
			return a / b;
		};

		System.out.println(addition.operation(10, 20));
		System.out.println(subs.operation(20, 5));
		System.out.println(multip.operation(2, 5));
		System.out.println(div.operation(10, 2));

		GreetingService service = (message) -> System.out.println(message);
		GreetingService service2 = message -> System.out.println(message);

		service.sayMessage("java8");
		service2.sayMessage("java8");
		
		//lambda expression can refer to final variable or effectively final variable!
		
		String test="test";
		GreetingService service3 = (message) -> System.out.println(message + " "+test);
		service3.sayMessage("message!");
	}
}

@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);
}

@FunctionalInterface
interface GreetingService {
	void sayMessage(String message);
}
