package ch13._08.reviewQuestions;

public class Q3 {

	public static void main(String[] args) {

		// Assuming that we have access to a WatchService object, which has been
		// properly initialized and registered with at least one Path, what two
		// problems make the code unusable?

//		for (;;) {
//			WatchKey key = watchService.poll();
//			for (WatchEvent<?> event : key.pollEvents())
//				System.out.println(event.kind() + "," + event.context());
//		}
		
		// A. It does not check if the WatchKey is null.
		// E. It does not reset the WatchKey after use.
	}
}
// WatchService.poll() method returns immediately with a value of null if there are no events available.
// The other major problem with this code is that the WatchKey method reset() is not called after the WatchKey is processed,
// For event type, it is recommended that you check for OVERFLOW events but it is not required,
