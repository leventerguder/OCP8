package ch09._06.files.attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

public class Test05FilesGetOwner {

	public static void main(String[] args) throws IOException {
		
		Path dir = Paths.get("folder");

		if (!Files.exists(dir)) {
			Files.createDirectory(dir);
		}
		
		UserPrincipal userPrincipal = Files.getOwner(dir);
		System.out.println(userPrincipal);
		System.out.println(userPrincipal.getName());
	}
}
