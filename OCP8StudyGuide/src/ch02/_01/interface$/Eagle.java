package ch02._01.interface$;

public class Eagle implements Fly {

	@Override
	public int getWingSpan() {
		return 15;
	}

	@Override // default method
	public void land() {
		System.out.println("Eagle is diving fast");
	}
}