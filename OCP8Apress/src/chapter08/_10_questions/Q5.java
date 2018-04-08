package chapter08._10_questions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Q5 {

	public static void main(String[] args) {
		//
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", Locale.US);
		System.out.println(formatter.format(LocalDateTime.now()));
	}
}
// E is the day name in the week; the pattern "EEEE" prints the name of the day in its full format. “