package ch03._02.generics;

public class Crate<T> {

	private T contents;
	// private static T staticVar;
	// Create a static variable as a generic type parameter. This is not allowed
	// because the type is linked to the instance of the class.

	public T emptyCrate() {
		return contents;
	}

	public void packCrate(T contents) {
		this.contents = contents;
	}

	// Call the constructor. new T() is not allowed because at runtime it would
	// be new Object().
	// private T cannotInstantiate = new T();

	private T[] array[];
	// private static T[] staArray[];

}
