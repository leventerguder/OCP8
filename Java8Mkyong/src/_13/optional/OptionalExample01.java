package _13.optional;

import java.util.Optional;

public class OptionalExample01 {

	public static void main(String[] args) {
		Optional<String> optional = Optional.of("java");
		//
		System.out.println(optional);
		System.out.println(optional.get());
		
		System.out.println(Optional.empty());

		String key1 = "key";
		String key2 = null;
		
		System.out.println(Optional.ofNullable(key1));
		System.out.println(Optional.ofNullable(key2));
		
		System.out.println(Optional.of(key1));
		
		//nullpointerexception
		System.out.println(Optional.of(key2));
		
	}
}
