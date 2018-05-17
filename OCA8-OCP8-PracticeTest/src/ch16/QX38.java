package ch16;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;

public class QX38 {
	public static void main(String... files) throws Exception {
		try (DatabaseHelper.MyDatabase myDb = new DatabaseHelper.MyDatabase()) {
			// TODO: Decide what to read/rite } finally {
			System.out.print("1");
		}
	}
}

class DatabaseHelper {
	// public class SQLException extends java.lang.Exception
	static class MyDatabase implements Closeable {
		// public void close() throws SQLException { // compile error
		// System.out.print("2");
		// }

		// Closeable # public void close() throws IOException;

		 public void close() { // compile error
			 System.out.print("2");
		 }
		
		public void write(String data) {
		}

		public String read() {
			return null;
		}
	}
}