package mock;

class WildCard {
	
	interface BI {
	}

	interface DI extends BI {
	}

	interface DDI extends DI {
	}

	static class C<T> {
	}

	static void foo(C<? super DI> arg) {
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		foo(new C<BI>()); // ONE
		foo(new C<DI>()); // TWO
		//foo(new C<DDI>()); // THREE //Compiler error
		foo(new C()); // FOUR
	}
}

public class QX14 {

}
