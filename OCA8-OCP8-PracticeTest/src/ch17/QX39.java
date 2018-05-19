package ch17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class QX39 {

	public static void main(String[] args) {
		LocalDateTime pi = LocalDateTime.of(2017, 3, 14, 1, 59);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M.ddhhmm");
		System.out.println(formatter.format(pi));
		// 3.140159
	}
}
