package chapter05._04_supplier;

import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierTest03 {

	public static void main(String[] args) {
		// Constructore References
		//

		Supplier<String> newString = String::new; // public String()
		//
		// This code makes use of constructor references. This code is
		// equivalent to:
		Supplier<String> newString2 = () -> new String();

		Supplier<Integer> cs = new String()::length;
		//

		Function<String, Integer> f1 = Integer::new; // Integer(String s)
		// We cannot use a Supplier here because Suppliers do not take any
		// arguments. Functions do take arguments and the return type here is
		// Integer, and hence we can use Function<String, Integer>.
		
		Function<String, SupplierTest03> f2 = SupplierTest03::new;
		
		Supplier<SupplierTest03> newTest03 = SupplierTest03:: new;
	}
	
	SupplierTest03(String s) {
		
	}
	
	SupplierTest03(){
		
	}
}
