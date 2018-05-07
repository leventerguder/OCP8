package ch13;

import java.util.function.Consumer;
import java.util.ArrayList;

public class QX19 {

	public static void main(String[] args) {
		//
		Consumer<ArrayList> c = n -> new ArrayList<>(n);

		Consumer<ArrayList> c2 = ArrayList::new;

	}
}
