package ch16;

public class QX39 {

//	public static void main(String[] args) {
//		// Unhandled exception type Exception thrown by automatic close() invocation on john
//		try (DiskPlayer john = new DiskPlayer()) {
//			System.out.println("ping");
//		} finally {
//			System.out.println("pong");
//		}
// 		System.out.println("return");
//	}
	
	public static void main(String[] args) throws Exception {

		try (DiskPlayer john = new DiskPlayer()) {
			System.out.println("ping");
		} finally {
			System.out.println("pong");
		}
		System.out.println("return");
	}
}

class DiskPlayer implements AutoCloseable {
	public void close() throws Exception {
	}
}