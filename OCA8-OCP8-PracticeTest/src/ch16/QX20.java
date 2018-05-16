package ch16;

public class QX20 {

	public static void main(String[] args) {
		final DataIntegrity johnny5 = new DataIntegrity();
		assert (johnny5.score > 2) : johnny5.score++;
		// assert johnny5.score >= 5 : System.out.print("No input"); //compile error
		System.out.print("Made it!");
	}
}

class DataIntegrity {
	 
	int score;

	public DataIntegrity() {
		super();
		DataIntegrity.this.score = 5;
	}
}