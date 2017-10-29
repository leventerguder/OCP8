package _01.lambda;

public class Example04 {

	public static void main(String[] args) {
		String name = "Levent";
		Runnable runnable = () -> System.out.println(name);
		runnable.run();

		String name2 = "old name";
		name2 = "new name";
		//Runnable runnable2 = () -> System.out.println(name2);
		// Local variable name2 defined in an enclosing scope must be final or
		// effectively final
		// - The value of the local variable runnable2 is not used
	}
}
