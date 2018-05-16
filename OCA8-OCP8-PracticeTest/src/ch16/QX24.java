package ch16;

import java.io.Closeable;

class ReadSign implements Closeable {
	public void close() {
	}

	public String get() {
		return "Hello";
	}
}

class MakeSign implements AutoCloseable {
	public void close() {
	}

	public void send(String message) {
		System.out.print(message);
	}
}

public class QX24 {
	public static void main(String... hands) {
		try (ReadSign r = new ReadSign(); MakeSign w = new MakeSign();) {
			w.send(r.get());
		}
	}
}
