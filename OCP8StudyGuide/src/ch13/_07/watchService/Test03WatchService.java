package ch13._07.watchService;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchService;

public class Test03WatchService {

	public static void main(String[] args) throws IOException {

		try (WatchService service = FileSystems.getDefault().newWatchService()) {

			Path path1 = Paths.get(".");
			path1.register(service, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);
		}
	}
}
