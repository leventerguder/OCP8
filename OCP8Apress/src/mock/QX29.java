package mock;

class BaseQ29<T> {

}

class DerivedQ29<T> {

}

public class QX29 {

	public static void main(String[] args) {
		BaseQ29<Number> b = new BaseQ29<Number>();
		DerivedQ29<Integer> d = new DerivedQ29<Integer>();
	}
}
