package ch11;

public class Q9 {

	public static void main(String[] args) {
		Transport.Bus bus = new Transport.Bus();
		boolean n = null instanceof Transport.Bus;
		boolean v = bus instanceof Transport.Vehicle;
		boolean b = bus instanceof Transport.Bus;
		System.out.println(n + " " + v + " " + b);
	}
}

class Transport {
	static interface Vehicle {
	}

	static class Bus implements Vehicle {
	}
}