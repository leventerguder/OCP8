package ch18;

import java.io.*;

public class QX40 {

	public static void main(String[] love) throws Throwable {
		try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("scan.txt"))) {
			final Valve v = new Valve();
			v.chambers = 2;
			v.size = 10.0;
			v.color = "RED";
			o.writeObject(v);
		}
		new Valve();
		try (ObjectInputStream o = new ObjectInputStream(new FileInputStream("scan.txt"))) {
			Valve v = (Valve) o.readObject();
			System.out.print(v.chambers + "," + v.size + "," + v.color);
		}
	}
}

class Valve implements Serializable {
	
	int chambers = -1;
	transient Double size = null;
	static String color;

	public Valve() {
		this.chambers = 3;
		color = "BLUE";
	}

	{
		chambers = 4;
	}
}