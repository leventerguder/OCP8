package ch08._01.reviewQuestions;

import java.io.Serializable;

public class QX22 {

}

// 22. What is the value of name after an instance of Eagle is serialized and
// then deserialized?

// Upon deserialization, the default initializations and constructor will be
// skipped, and they will both be null

class Bird implements Serializable {
	protected transient String name = "Bridget";

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Bird() {
		this.name = "Matt";
	}
}

class Eagle extends Bird implements Serializable {
	{
		this.name = "Janette";
	}

	public Eagle() {
		this.name = "Daniel";
	}
}