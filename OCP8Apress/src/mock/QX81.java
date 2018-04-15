package mock;

public class QX81 {

}

// Which of the following are functional interfaces? (Select all that apply.)

@FunctionalInterface
interface Foo {
	void execute();
}

@FunctionalInterface
interface Foo2 {
	void execute();

	boolean equals(Object arg0);
}
