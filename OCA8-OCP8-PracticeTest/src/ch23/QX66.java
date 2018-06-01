package ch23;

public class QX66 {

}

abstract class TShirt {

	abstract int insulate();

	public TShirt() {
		System.out.println("Starting...");
	}
}
class Wardrobe {

	abstract class Sweater extends TShirt {
		int insulate() {
			return 5;
		}
	}

	private static void dress() {
		
//		class Jacket extends Sweater { // v1 //compile error
//			int insulate() {
//				return 10;
//			}
//		}
		;
//		final TShirt outfit = new Jacket() { // v2 
//			int insulate() {return 20;}
//		};
//		System.out.println("Insulation:" + outfit.insulate());
	}
}