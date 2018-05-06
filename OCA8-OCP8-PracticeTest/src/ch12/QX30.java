package ch12;

public class QX30 {

}

interface CanBurrow {
	public abstract void burrow();
}

@FunctionalInterface
interface HasHardShell extends CanBurrow {
} // k1

abstract class Tortoise implements HasHardShell { // k2
	public abstract int toughness();
}

//  The code does not compile because of line k3.
//class DesertTortoise extends Tortoise { // k3
//	public int toughness() {
//		return 11;
//	}
//}