package ch14;

import java.util.function.*;

public class QX12 {

	public static void main(String[] args) {
		Magician magician = new Magician();
		
		magician.magic((b,w) -> (long)w.intValue());
	}
}

class Magician {
	public void magic(BinaryOperator<Long> lambda) {
		lambda.apply(3L, 7L);
	}
}
