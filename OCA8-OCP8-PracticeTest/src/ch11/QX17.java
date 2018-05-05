package ch11;

import java.util.ArrayList;

public class QX17 {

	static interface Vehicle {
	}

	static class Bus implements Vehicle {
	}

	public static void main(String[] args) {
		Bus bus = new Bus();
		//
		System.out.println(null instanceof Bus);
		System.out.println(bus instanceof Vehicle);
		System.out.println(bus instanceof Bus);
		// System.out.println(bus instanceof ArrayList); // compiler error
		System.out.println();
	}
}
