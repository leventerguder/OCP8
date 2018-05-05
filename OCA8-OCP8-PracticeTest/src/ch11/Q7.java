package ch11;

public class Q7 {

}

class Tool {
	void use() {
	} // r1
}

class Hammer extends Tool {
//	private void use() { compile error
//	}// r2  
	public void bang() { }
	// r3
}