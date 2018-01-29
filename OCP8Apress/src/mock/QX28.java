package mock;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class QX28 {

	public static void main(String[] args) {

		LocalDate dateOfBirth = LocalDate.of(1988, Month.NOVEMBER, 4);
		MonthDay monthDay = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
		boolean ifTodayBirthday = monthDay.equals(MonthDay.from(LocalDate.now())); // COMPARE
		System.out.println(ifTodayBirthday ? "Happy birthday!" : "Yet another day!");
	}
}
