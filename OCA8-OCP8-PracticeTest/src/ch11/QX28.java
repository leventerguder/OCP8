package ch11;

public class QX28 {

}

class ToolQX28 {
	void use() {
	} // r1
}

class HammerQX28 extends ToolQX28 {
	private void use(String s) {
	} // r2

	public void bang() {
	} // r3
}

// Which is the first line to fail to compile?
// D None of the above