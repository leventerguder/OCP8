package ch02._01.interface$;

interface CanWalk {
	default void walk() {
		System.out.println("Walking");
	}
}

interface CanRun {

	public default void walk() {
		System.out.println("Walking");
	}

	public abstract void run();

}

// Duplicate default methods named walk with the parameters () and () are
// inherited from the types CanRun and CanWalk
public interface CanSprint extends CanWalk, CanRun {

	@Override
	default void walk() {
		CanRun.super.walk();
	}

}
