package ch12;

public class QX31 {

}

interface Alex {
	default void write() {
	}

	static void publish() {
	}

	void think();
}

interface Michael {
	public default void write() {
	}

	public static void publish() {
	}

	public void think();
}

class Twins implements Alex, Michael {
	@Override
	public void write() {
	}

//	@Override
//	public static void publish() {
//	}

	@Override
	public void think() {
		System.out.print("Thinking...");
	}
}
