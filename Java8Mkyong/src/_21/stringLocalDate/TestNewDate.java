package _21.stringLocalDate;

import java.time.LocalDate;

public class TestNewDate {
	public static void main(String[] args) {
		String date = "2016-08-16";
		
		//default, ISO_LOCAL_DATE
		LocalDate localDate = LocalDate.parse(date);
		System.out.println(localDate);
	}
}
