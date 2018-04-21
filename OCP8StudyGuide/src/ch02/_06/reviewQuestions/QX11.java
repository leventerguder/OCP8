package ch02._06.reviewQuestions;

interface Secret {
	String magic(double d);
}

class MySecret implements Secret {
	public String magic(double d) {
		return "Poof";
	}
}

public class QX11 {

	public static void main(String[] args) {
		Secret s = (e) -> "Poof";
		Secret s2 = (e) -> {
			String f = "";
			return "Poof";
		};
	}
}
