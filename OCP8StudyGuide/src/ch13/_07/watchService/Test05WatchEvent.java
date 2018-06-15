package ch13._07.watchService;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Test05WatchEvent {

	// We have WatchLey , we can use that to retrieve a list available events
	// and process them.
	
	// we request all available events by calling pollEvents
	// The event details include the type of event , which is retrieved by calling the kind method
	// it also includes a reference to the Path associated with the event , which is retrieved by using the context method.
	// Once we have processed all of events available to the Watchkey , we must call the reset method
	// on the current WatchKey instance before the next call to retrieve a new WatchKey
	// When using the WatchService API, it is critical not to skip the reset() method call !

	public static void main(String[] args) throws IOException {
		
		try(WatchService service = FileSystems.getDefault().newWatchService()){
			
			Path path1 = Paths.get(".");
			path1.register(service, StandardWatchEventKinds.ENTRY_CREATE,
								    StandardWatchEventKinds.ENTRY_DELETE , 
								    StandardWatchEventKinds.ENTRY_MODIFY);
			
			// Poll for events
			
			for(;;){
				WatchKey key;
				try {
					key = service.take();
				}catch(InterruptedException x){
					break;
				}
			
				for(WatchEvent<?> event : key.pollEvents()){
					WatchEvent.Kind<?> kind = event.kind();
					if(kind == StandardWatchEventKinds.OVERFLOW)
						continue;
					
					WatchEvent<Path> watchEvent = (WatchEvent<Path>) event;
					Path path = watchEvent.context();
					
					System.out.println("[eventType="+kind +", path="+path.getFileName()+"]");
				}
				
				// Remember to always reset event key 
				if(!key.reset()) {
					break; 
				}
			
			}
			
			
		}
	}

}
