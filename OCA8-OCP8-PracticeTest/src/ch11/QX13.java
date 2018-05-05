package ch11;

public class QX13 {

	public static void main(String[] args) {
		ComputerQX13 computer = new LaptopQX13();
		LaptopQX13 laptop = new LaptopQX13();
		System.out.print(computer.type + "," + laptop.type);
	}
}

class LaptopQX13 extends ComputerQX13 {
	String type = "laptop";
}

class ComputerQX13 {
	String type = "computer";
}