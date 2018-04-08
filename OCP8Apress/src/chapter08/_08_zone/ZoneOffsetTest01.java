package chapter08._08_zone;

import java.time.ZoneOffset;

public class ZoneOffsetTest01 {

	public static void main(String[] args) {
		//
		ZoneOffset offset = ZoneOffset.of("+02:00");
		System.out.println(offset);
	}
}
