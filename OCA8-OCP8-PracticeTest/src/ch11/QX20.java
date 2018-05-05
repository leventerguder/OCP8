package ch11;

import java.util.*;

public class QX20 {

}

class Secret {
	
	private int number = new Random().nextInt(10);

	public boolean guess(int candidate) {
		return number == candidate;
	}
}
//  D None. It is already well encapsulated.