package ch12;

public class Q9 {

}

enum Currency {
	DOLLAR, YEN, EURO
}

abstract class Provider {
	protected Currency c = Currency.EURO;
}

class Bank extends Provider {
	protected Currency c = Currency.DOLLAR;

	// The code does not compile.
	
//	public static void main(String[] pennies) {
//		int value = 0;
//		switch (new Bank().c) {
//		case 0:
//			value--;
//			break;
//		case 1:
//			value++;
//			break;
//		}
//		System.out.print(value);
//	}
}
