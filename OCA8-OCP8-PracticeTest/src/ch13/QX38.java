package ch13;

import java.util.Collection;
import java.util.List;
import java.util.Arrays;

public class QX38 {

	public static void main(String[] args) {
		WashQX38<List> wash = new WashQX38<List>();
		wash.clean(Arrays.asList("sock", "tie"));
	}
}

class WashQX38<T extends Collection> {

	T item;

	public void clean(T items) {
		System.out.println("Cleaned " + items.size() + " items");
	}
}
