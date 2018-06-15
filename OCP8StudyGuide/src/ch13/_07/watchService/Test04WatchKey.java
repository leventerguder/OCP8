package ch13._07.watchService;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

public class Test04WatchKey {

	// The WatchService API has three methods that check for and return an event
	// key

	public static void main(String[] args) throws IOException, InterruptedException {

		try (WatchService service = FileSystems.getDefault().newWatchService()) {
			Path path1 = Paths.get(".");
			path1.register(service, StandardWatchEventKinds.ENTRY_CREATE);

			for (;;) {
				WatchKey key;
				try {
					//key = service.take();
					key = service.poll(1,TimeUnit.SECONDS);
					System.out.println(key);
				} catch (InterruptedException x) {

				}
			}
		}
	}
}
