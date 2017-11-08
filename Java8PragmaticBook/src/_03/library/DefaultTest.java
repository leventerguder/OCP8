package _03.library;

interface Parent {

	public default void welcome() {
		System.out.println("Parent#welcome");
	}
}

interface Child extends Parent {
	@Override
	public default void welcome() {
		System.out.println("Child#welcome");
	}
}

class ParentImpl implements Parent {

}

class ChildImpl implements Child {

}

public class DefaultTest {

	public static void main(String[] args) {
		Parent p = new ParentImpl();
		p.welcome();
		//
	}

}
