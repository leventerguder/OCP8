package ch16;

import java.io.Closeable;
import java.io.IOException;

public class QX11 {
	public static void main(String[] headlines) {
		new PrintCompany().new Printer().printHeadlines(); // r3 
	}
}

class PrintCompany {

	class Printer implements Closeable {

		public void print() {
			System.out.println("This just in!");
		}

		@Override
		public void close() {

		}
		
		public void printHeadlines(){
		// compiler error	
		//		try {Printer p = new Printer()} { // r2
		//		p.print(); }
			try(Printer p = new Printer()){
				p.print();
			}
		}

	}
}