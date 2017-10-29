package _01.lambda;

public class Example02 {

	public static void main(String[] args) {
		
		Runnable runnable = () -> System.out.println("Hello Lambda!");
		runnable.run();
		
		Runnable runnable2 = () -> {
			System.out.println("Hello Lambda Line1");
			System.out.println("Hello Lambda Line2");
		};
		
		runnable2.run();
		
		Runnable r3  = () -> {};
		r3.run();
	}
}
