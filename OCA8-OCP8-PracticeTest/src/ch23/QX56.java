package ch23;

import java.util.function.Supplier;

public class QX56 {

}

class Ready {
	private static double getNumber() {
		return .007;
	}

	public static void math() {
		//Supplier<double> s = Ready:getNumber; //compile error! not double ! Double
		Supplier<Double> s = Ready::getNumber;
		double d = s.get(); System.out.println(d);
	}
}