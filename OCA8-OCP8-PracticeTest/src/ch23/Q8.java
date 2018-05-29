package ch23;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Q8 {
	
	public boolean isItMyBirthday(LocalDateTime dateTime) {
		//LocalDate now = LocalDate.now();
		LocalDateTime now = LocalDateTime.now();
		return now.getMonth() == dateTime.getMonth()
				&& now.getDayOfMonth() == dateTime.getDayOfMonth();
	}
}
