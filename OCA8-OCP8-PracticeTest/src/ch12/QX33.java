package ch12;

public class QX33 {
	public static void main(String[] courses) {
		// final Study s = new BiologyMaterial() {
		// };
		// System.out.print(s.learn(courses[0], Integer.parseInt(courses[1])));

		//
		Study b = (x, y) -> {
			return x == null ? y : y + 1;
		};
	}
}

@FunctionalInterface
interface Study {
	abstract int learn(String subject, int duration);
}

class BiologyMaterial implements Study {
	@Override
	public int learn(String subject, int duration) {
		if (subject == null)
			return duration;
		else
			return duration + 1;
	}
}