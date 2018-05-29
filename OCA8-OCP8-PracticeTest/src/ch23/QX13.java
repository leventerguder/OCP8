package ch23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class QX13 {

	public static void main(String... passengers) throws Exception {
		try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("ship.txt"))) {
			Cruise c = new Cruise();
			c.numPassengers = 4;
			c.schedule = "Casino";
			o.writeObject(c);
		}
		try (ObjectInputStream i = new ObjectInputStream(new FileInputStream("ship.txt"))) {
			Cruise c = (Cruise) i.readObject();
			System.out.print(c.numPassengers + "," + c.schedule);
		}
	}
}

class Cruise {

	int numPassengers = 1;
	transient String schedule = "NONE";
	{
		numPassengers = 2;
	}

	public Cruise() {
		this.numPassengers = 3;
		this.schedule = "Tropical Island";
	}
}