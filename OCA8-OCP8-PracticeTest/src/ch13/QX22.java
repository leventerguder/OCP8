package ch13;

public class QX22 {

	public static void main(String[] args) {
		Wash wash1 = new Wash();
		wash1.clean("socks");

		Wash wash2 = new Wash<String>();
		wash2.clean("socks");

		Wash<String> wash3 = new Wash<>();
		wash3.clean("socks");
	}
}

class Wash<T> {

	T item;

	public void clean(T item) {
		System.out.println("Clean " + item);
	}
}