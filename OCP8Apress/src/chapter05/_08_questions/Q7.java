package chapter05._08_questions;

import java.util.function.Predicate;

public class Q7 {

	public static void main(String[] args) {
		// public boolean contains(CharSequence s)
		Predicate<String> predContains = "I am going to write OCP8 exam"::contains;
		
		checkString(predContains, "OCPJP");
	}
	
    static void checkString(Predicate<String> predicate, String str) {
        System.out.println(predicate.test(str) ? "contains" : "doesn't contain");
    }
}
