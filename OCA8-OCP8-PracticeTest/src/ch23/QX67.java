package ch23;

import java.util.function.Function;
import java.util.function.IntSupplier;

class Shield {
	
}

 class Sword {

	public class Armor {
		int count;
		// public final Function<Shield,Sword,Armor> dress = (h,w) -> new Armor(); //compile error
		// public final IntSupplier<Integer> addDragon = () -> count++; 
		//compile error
	}
	
}
