package ch12;

public class QX32 {

	void method() {

		class localinner {
		}
	}

	static class StaticNested {
		static void method() {

		}

	}
}

abstract class Abs {
	public static void method() {

	}
}

enum Enums {
	A, B;
	static int method() {
		return 1;
	}
}
