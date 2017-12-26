package ch05._01.creatingDateAndTime;

import java.time.LocalTime;

public class Test02LocalTime {

	public static void main(String[] args) {

		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(20, 30);
		LocalTime time3 = LocalTime.of(20, 35, 40);
		LocalTime time4 = LocalTime.of(10, 30, 8, 200);
		//

		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		System.out.println(time4);
	}
}
