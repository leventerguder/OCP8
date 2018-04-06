package chapter03.questions;

enum PrinterType {

	DOTMATRIX(5), INKJET(10), LASER(50); // #2

	// You need to define enum elements first before any other attribute in an enum class.
	private int pagePrintCapacity; // #1

	private PrinterType(int pagePrintCapacity) {
		this.pagePrintCapacity = pagePrintCapacity;
	}

	public int getPrintPageCapacity() {
		return pagePrintCapacity;
	}
}

public class Q6 {

}
