package ch12;

public class Q4 {

	final class Inner {

	}

	final static class StaticNested {

	}

	void method() {
		final class LocalInner {

		}

	}
}

interface I {

}

// Which of the following class types cannot be marked final or abstract?
// A. Static nested class
// B. Local inner class
// C. Anonymous inner class (+)
// D. Member inner class