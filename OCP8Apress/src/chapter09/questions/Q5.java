package chapter09.questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Q5 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		USPresident usPresident = new USPresident("Barack Obama", "2009 to --", 56);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("USPresident.data"))) {
			oos.writeObject(usPresident);
			usPresident.setTerm(57);
			oos.writeObject(usPresident);
		}
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("USPresident.data"));
		USPresident found = (USPresident) ois.readObject();
		System.out.println(found.getTerm());
	}
}

class USPresident implements Serializable{
	private String name;
	private String to;
	private int term;

	public USPresident(String name, String to, int term) {
		super();
		this.name = name;
		this.to = to;
		this.term = term;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

}
