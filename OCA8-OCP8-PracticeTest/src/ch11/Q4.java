package ch11;

class Laptop extends Computer {
	public void startup() {
		System.out.print("laptop-");
	}
}

class Computer {

	public void startup() {
		System.out.print("computer-");
	}
}

public class Q4 {

	public static void main(String[] args) {
		Computer computer = new Laptop();
		Laptop laptop = new Laptop();
		computer.startup();
		laptop.startup();

	}
}
