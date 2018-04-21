package ch02._06.reviewQuestions;

public class QX12 {

}

interface ClimbX12 {
	boolean isTooHigh(int height, int limit);
}

class Climber {
	public static void main(String[] args) {
		//check((h, l) -> h.toString(), 5); // x1
	}

	private static void check(ClimbX12 climb, int height) {
		if (climb.isTooHigh(height, 10)) // x2
			System.out.println("too high");
		else
			System.out.println("ok");
	}
}
