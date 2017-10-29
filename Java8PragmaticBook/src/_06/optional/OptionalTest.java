package _06.optional;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		Optional<String> optional= Optional.of("Levent");
		
		System.out.println(optional.get());
		
		Optional empty = Optional.empty();
		System.out.println(empty.isPresent());
		
		Optional alsoEmpty = Optional.ofNullable(null);
		
		System.out.println(empty);
		System.out.println(alsoEmpty);
		
		String orelse=(String) alsoEmpty.orElse("hebele");
		
		System.out.println(orelse);
	}
}
