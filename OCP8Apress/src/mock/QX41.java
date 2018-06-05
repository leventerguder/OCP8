package mock;

import java.time.LocalDateTime;

interface InterfaceOne<T> {
	void foo();
}

interface InterfaceTwo<T> {
	T foo();
}

interface InterfaceThree<T> {
	void foo(T arg);
}

interface InterfaceFour<T> {
	T foo(T arg);
}

public class QX41 {

	public static void main(String[] args) {
		InterfaceOne<LocalDateTime> val1 = LocalDateTime::now;
		InterfaceTwo<LocalDateTime> val2 = LocalDateTime::now;
		// InterfaceThree<LocalDateTime> val3 = LocalDateTime::now;
		// InterfaceFour<LocalDateTime> val4 = LocalDateTime::now;
		
        // System.out.println(val1.foo());
        System.out.println(val2.foo());
	}
}
