package chapter03.questions;

public class Q5 {
	//
	PrinterType printerType;

	enum PrinterType {
		INKJET, DOTMATRIX, LASER
	};

	public Q5(PrinterType pType) {
		printerType = pType;
	}

	public static void main(String[] args) {
		// PrinterType pType = new PrinterType();
		// Compiler error: cannot instantiate the type EnumTest.PrinterType
		Q5 enumTest = new Q5(PrinterType.LASER);
	}
}