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

class OverridingParent extends ParentImpl {
	@Override
	public void welcome() {
		System.out.println("OverridingParent#welcome");
	}
}

class OverridingChild extends OverridingParent {
	@Override
	public void welcome() {
		System.out.println("OverridingChild#welcome");
	}
}

public class DefaultTest {

	public static void main(String[] args) {
		Parent p = new ParentImpl();
		p.welcome();
		//

		Child c = new ChildImpl();
		c.welcome();

		//
		Parent override = new OverridingChild();
		override.welcome();
		// class wins
	}

}

// Any class wins over any interface. So if there’s a method with a body, or an
// abstract declaration, in the superclass chain, we can ignore the interfaces
// completely.

// Subtype wins over supertype. If we have a situation in which two interfaces
// are competing to provide a default method and one interface extends the
// other, the subclass wins.

// No rule 3. If the previous two rules don’t give us the answer, the subclass
// must either implement the method or declare it abstract.