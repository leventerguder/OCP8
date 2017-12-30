package ch05._03.periods;

import java.time.Period;

public class Test05Period {

	public static void main(String[] args) {
		Period p = Period.parse("P2Y10M30D"); 
		System.out.println(p);
	}
}
