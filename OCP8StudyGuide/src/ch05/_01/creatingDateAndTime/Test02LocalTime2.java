package ch05._01.creatingDateAndTime;

import java.time.LocalTime;

public class Test02LocalTime2 {

	public static void main(String[] args) {
		LocalTime lTime = LocalTime.ofSecondOfDay(2452);
		// valid values 0 - 86399
		// java.time.DateTimeException
		System.out.println(lTime);
		//

		LocalTime lTime2 = LocalTime.ofNanoOfDay(5467);
		// valid values 0 - 86399999999999
		// java.time.DateTimeException
		System.out.println(lTime2);
	}
}
