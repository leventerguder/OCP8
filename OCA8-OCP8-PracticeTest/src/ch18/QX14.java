package ch18;

public class QX14 {

	// Let’s say we want to write an instance of Cereal to disk, having a name
	// value of CornLoops. What is the value of name after this object has been
	// read using the ObjectInputStream’s readObject() method?
	
	// D. None of the above
	// Not serializable !
}

class Cereal {
	private String name = "CocoaCookies";
	private transient int sugar;

	public Cereal() {
		super();
		this.name = "CaptainPebbles";
	}

	{
		name = "SugarPops";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
}