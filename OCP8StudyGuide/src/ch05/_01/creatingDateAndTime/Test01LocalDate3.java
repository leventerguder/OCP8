package ch05._01.creatingDateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test01LocalDate3 {

	public static void main(String[] args) {
		LocalDate parsed = LocalDate.parse("2017-03-19");
		System.out.println(parsed);

		LocalDate.parse("30/12/2017", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
