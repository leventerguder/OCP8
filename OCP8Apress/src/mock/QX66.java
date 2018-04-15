package mock;

import java.util.function.Supplier;

class Book {
	public void read() {
		System.out.println("read!");
	}
}

public class QX66 {

	private void readBook(Supplier<? extends Book> book) {
		book.get().read();
	}

	public static void main(String[] args) {
		new QX66().readBook(Book::new);
	}
}
