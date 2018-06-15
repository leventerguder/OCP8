package ch13._07.watchService;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.WatchService;

public class Test01WatchService {

	// WatchService framework for monitoring changes to directories in real time.
	// We use FileSystems helper class to obtain a reference to the default FileSystem.
	
	public static void main(String[] args) throws IOException {
		
		// java.nio.file.WatchService (interface) extends Closeable
		try(WatchService service = FileSystems.getDefault().newWatchService()) {
			
		}
	}
}
