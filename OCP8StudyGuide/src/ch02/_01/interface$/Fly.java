package ch02._01.interface$;

public interface Fly {

	public int getWingSpan() throws Exception;

	public static final int MAX_SPEED = 100;

	public default void land() {
		System.out.println("Animal is landing...");
	}

	public default void eat() {
		System.out.println("Animal is eating...");
	}

	public static double calculateSpeed(float distance, double time) {
		return distance / time;
	}
}
