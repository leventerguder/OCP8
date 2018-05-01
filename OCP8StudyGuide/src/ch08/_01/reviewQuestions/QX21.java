package ch08._01.reviewQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class QX21 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f.txt"));
		Zebra z = new Zebra();
		oos.writeObject(z);
		//
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f.txt"));
		Object zz = ois.readObject();
		System.out.println(zz);
	}

}
// Assuming the following class has proper public getter/setter methods for all
// of its private fields, which of the following fields will always be null
// after an instance of the class is serialized and then deserialized? (Choose
// all that apply.)

class Zebra implements Serializable {
	private static final long serialUID = 1L;
	private transient String name = "George";
	private static String birthPlace = "Africa";
	private transient Integer age;
	private java.util.List<Zebra> friends = new java.util.ArrayList<>();
	private Object tail = null;
	{
		age = 10;
	}

	public Zebra() {
		this.name = "Sophia";
	}

	@Override
	public String toString() {
		return "Zebra [name=" + name + ", age=" + age + ", friends=" + friends + ", tail=" + tail + "]";
	}

}