package ch05._01.creatingDateAndTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test02LocalTime3 {

	public static void main(String[] args) {
		LocalTime parsed = LocalTime.parse("10:20");
		System.out.println(parsed);

		LocalTime parsed2 = LocalTime.parse("10:20:04");
		System.out.println(parsed2);
		
		LocalTime parsed3 = LocalTime.parse("20:30:10" , DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println(parsed3);
		
		LocalTime parsed4 = LocalTime.parse("20:30:10.200" , DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));
		System.out.println(parsed4);
	}
}