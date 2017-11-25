package ch03._02.generics;

public interface Shippable<T> {
	public void ship(T t);
}

class ShippableAbstractCrate<U> implements Shippable<U> {
	public void ship(U t) {
	}
}

class ShippableCrate implements Shippable {
	public void ship(Object t) {
	}
}