package ch05._01.creatingDateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test03LocalDateTime3 {

	public static void main(String[] args) {
		String str1 = "2017-12-30T15:15:46.302";
		String str2 = "1989-06-18 12:00";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

		System.out.println(LocalDateTime.parse(str1));
		System.out.println(LocalDateTime.parse(str2, formatter));

	}
}
