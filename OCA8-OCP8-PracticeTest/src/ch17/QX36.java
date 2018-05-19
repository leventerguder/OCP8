package ch17;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class QX36 {

	public boolean isItMyBirthday(LocalDateTime dateTime) {
		LocalDate now = LocalDate.now();
		return now.getMonth() == dateTime.getMonth() && now.getDayOfMonth() == dateTime.getDayOfMonth();
	}
}
// Which of the following can fill in the blank to make this code compile?
// LocalDate now = LocalDate.now();
