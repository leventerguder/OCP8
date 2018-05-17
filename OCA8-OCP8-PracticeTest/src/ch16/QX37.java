package ch16;

public class QX37 {
	public static void main(String[] aluminum) {
		assert new Falcon(null).parsec < 12;
	}
}

// java -da -ea:Falcon Falcon
class Falcon extends Exception {

	int parsec = 12;

	public Falcon(String name) {
		super(name);
	}

}