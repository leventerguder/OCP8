package ch14;

import java.util.function.BooleanSupplier;

public class QX39 {

}

class Warehouse {
	private int quantity = 40;
	private final BooleanSupplier stock;
	{
		stock = () -> quantity > 0;
	}

	public void checkInventory() {
		
	    // boolean getAsBoolean();	
//		if (stock.get())
//			System.out.print("Plenty!");
//		else {
//			System.out.print("On Backorder!");
//		}
	}
}