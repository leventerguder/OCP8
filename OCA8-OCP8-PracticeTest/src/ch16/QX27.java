package ch16;

public class QX27 {

	public static void main(String[] args) {
		// compile error
		// new Fetch().play("Webby");
		// new Fetch().play("Georgette");
	}
}

class Fetch {

	public int play(String dogName) throws Exception {
		try {
			throw new RuntimeException(dogName);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}