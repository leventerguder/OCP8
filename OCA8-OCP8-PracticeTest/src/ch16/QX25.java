package ch16;

public class QX25 {

	public static void main(String[] args) {
		try (FunEvent f = new FunEvent()) {
			System.out.print("2");
			throw new ArithmeticException();
		} catch (Exception e) {
			System.out.print("3");
		} finally {
			System.out.print("4");
		}

		// 2134
	}
}

class FunEvent implements AutoCloseable {
	public void close() {
		System.out.print("1");
	}
}